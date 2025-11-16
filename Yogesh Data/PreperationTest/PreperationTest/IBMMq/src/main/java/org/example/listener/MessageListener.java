package org.example.listener;

import jakarta.jms.JMSException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Message listener for processing JMS messages from IBM MQ.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class MessageListener {
    
    private final JmsTemplate jmsTemplate;

    /**
     * Processes incoming JMS messages.
     *
     * @param message the message payload
     * @param headers the message headers
     * @param jmsMessage the raw JMS message
     * @throws JMSException if there's an error processing the message
     */
    @JmsListener(destination = "${ibm.mq.queue.request}")
    public void receiveMessage(
            @Payload String message,
            @Headers MessageHeaders headers,
            jakarta.jms.Message jmsMessage) throws JMSException {
        
        log.info("Received message: {}", message);
        
        try {
            // Process the message here
            String response = processMessage(message);
            
            // If this is a request-reply pattern, send response
            if (jmsMessage.getJMSReplyTo() != null) {
                sendResponse(jmsMessage, response);
            }
        } catch (Exception e) {
            log.error("Error processing message: {}", message, e);
            throw e;
        }
    }
    
    private String processMessage(String message) {
        // Add your message processing logic here
        return "Processed: " + message;
    }
    
    private void sendResponse(jakarta.jms.Message originalMessage, String response) throws JMSException {
        jmsTemplate.convertAndSend(
            originalMessage.getJMSReplyTo(),
            response,
            m -> {
                m.setJMSCorrelationID(originalMessage.getJMSCorrelationID());
                return m;
            }
        );
    }
}
