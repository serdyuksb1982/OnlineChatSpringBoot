package main;

import main.controller.ChatController;
import main.repository.MessageRepository;
import main.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * test
 */

public class JUnitControllerTest {
    @Test
    public void testHomeController() {
        ChatController homeController = new ChatController();
        String result = homeController.home();
        assertEquals(result, "Hello World!");
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;


}
