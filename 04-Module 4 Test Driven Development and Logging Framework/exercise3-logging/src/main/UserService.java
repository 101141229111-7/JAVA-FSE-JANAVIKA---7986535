package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void processUser(int id) {
        logger.info("Processing user with id: {}", id);

        if (id <= 0) {
            logger.error("Invalid user id: {}", id);
        } else {
            logger.debug("User id {} is valid", id);
        }
    }
}
