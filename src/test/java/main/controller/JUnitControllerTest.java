package main.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitControllerTest {

    @Test
    public void shouldGetWelcomeMessage() {
        ChatController controller = new ChatController();
        assertEquals("Hello John!",controller.welcome("John"));
    }

}
