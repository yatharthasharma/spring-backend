package uk.yath.springbackend.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestController.class);

    @GetMapping("/")
    ResponseEntity<HttpStatus> getMapping() {
        LOGGER.info("Get endpoint is working!");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
