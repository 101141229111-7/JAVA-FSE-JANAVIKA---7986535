package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserName() {
        // Create a mock of UserRepository
        UserRepository mockRepo = mock(UserRepository.class);

        // Define behavior for mock
        when(mockRepo.findUserById(1)).thenReturn("John");

        // Inject mock into service
        UserService service = new UserService(mockRepo);

        // Call method under test
        String result = service.getUserName(1);

        // Assert result
        assertEquals("John", result);

        // Verify interaction with mock
        verify(mockRepo).findUserById(1);
    }
}
