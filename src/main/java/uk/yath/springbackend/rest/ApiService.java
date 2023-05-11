package uk.yath.springbackend.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiService.class);

    public ApiService(@Autowired KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private final KafkaTemplate<String, String> kafkaTemplate;

    void sendOperation() {
        LOGGER.info("Service operated on the GET request");
        kafkaTemplate.send("test-topic", "Hello world!");
    }

    @KafkaListener(topics = "test-topic")
    private void listenOperation(String message) {
        LOGGER.info("Listener1: Received Message in group test-topic: {}", message);
    }
}
