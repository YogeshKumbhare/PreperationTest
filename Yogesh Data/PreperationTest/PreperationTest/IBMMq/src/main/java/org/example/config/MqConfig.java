package org.example.config;

import com.ibm.mq.jms.MQQueueConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import jakarta.jms.ConnectionFactory;

@Configuration
public class MqConfig {

    @Value("${ibm.mq.queue-manager}")
    private String queueManager;

    @Value("${ibm.mq.channel}")
    private String channel;

    @Value("${ibm.mq.conn-name}")
    private String connName;

    @Value("${ibm.mq.user}")
    private String user;

    @Value("${ibm.mq.password}")
    private String password;

    @Bean
    public ConnectionFactory connectionFactory() throws Exception {
        MQQueueConnectionFactory factory = new MQQueueConnectionFactory();
        factory.setQueueManager(queueManager);
        factory.setChannel(channel);
        String[] connParts = connName.split("\\(");
        String host = connParts[0];
        int port = Integer.parseInt(connParts[1].replace(")", ""));
        factory.setStringProperty("HOST_NAME", host);
        factory.setIntProperty("PORT", port);
        factory.setTransportType(com.ibm.msg.client.wmq.WMQConstants.WMQ_CM_CLIENT);
        return factory;
    }

    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {
        JmsTemplate template = new JmsTemplate(connectionFactory);
        // For Spring JMS 6.x, pub/sub configuration is done through the destination resolver
        // or by setting the default destination type on the JmsTemplate
        template.setPubSubDomain(false);
        return template;
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory(
            ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        // This provides all boot's default to this factory, including the message converter
        configurer.configure(factory, connectionFactory);
        // You can override some of Boot's defaults if necessary
        factory.setConcurrency("3-10");
        factory.setPubSubDomain(false);
        return factory;
    }
}
