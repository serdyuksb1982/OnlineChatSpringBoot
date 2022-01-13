package main;

import main.controller.ChatController;
import main.model.Message;
import main.model.User;
import main.repository.MessageRepository;
import main.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public User get(@PathVariable String id) {
        return userRepository.getBySessionId(id);
    }

    @RequestMapping(value = "message/{id}", method = RequestMethod.GET)
    public Optional<Message> get(@PathVariable int id) {
        return messageRepository.findById(id);
    }

}
