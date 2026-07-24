package com.example;

import org.junit.jupiter.api.Test;   // JUnit 5 annotation

public class UserServiceTest {

    @Test
    void testProcessUser() {
        UserService service = new UserService();
        service.processUser(1);   // logs INFO + DEBUG
        service.processUser(-5);  // logs INFO + ERROR
    }
}
