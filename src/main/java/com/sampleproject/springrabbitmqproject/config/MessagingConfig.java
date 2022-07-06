package com.sampleproject.springrabbitmqproject.config;

import ch.qos.logback.classic.pattern.MessageConverter;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {

    @Bean
    public Queue queue(){
        return new Queue("Message_queue");
    }
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("Message_Exchange");
    }
    @Bean
    public Binding binding(Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("Message_routing_key");
    }
//    @Bean
//    public MessageConverter converter(){
//        return new Jackson2JsonMessageConverter();
//    }
}
