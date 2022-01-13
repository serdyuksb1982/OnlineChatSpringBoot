package main;

import main.controller.ChatController;
import org.junit.jupiter.api.Test;

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
}
