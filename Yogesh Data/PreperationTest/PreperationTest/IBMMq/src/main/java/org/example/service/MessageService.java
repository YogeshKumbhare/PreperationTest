package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Value("${ibm.mq.queue.request}")
    private String requestQueue;

    @Value("${ibm.mq.queue.reply}")
    private String replyQueue;

    private final JmsTemplate jmsTemplate;

    @Autowired
    public MessageService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(requestQueue, message);
    }

    public String sendAndReceive(String message) {
        return (String) jmsTemplate.convertSendAndReceive(
            requestQueue,
            message,
            message1 -> {
                message1.setJMSReplyTo(jmsTemplate.getDestinationResolver().resolveDestinationName(
                    jmsTemplate.getConnectionFactory().createContext(),
                    replyQueue,
                    false
                ));
                return message1;
            }
        );
    }
}
