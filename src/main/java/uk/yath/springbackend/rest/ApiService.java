package uk.yath.springbackend.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiService.class);

    void operation() {
        LOGGER.info("Service operated on the GET request");
    }
}
