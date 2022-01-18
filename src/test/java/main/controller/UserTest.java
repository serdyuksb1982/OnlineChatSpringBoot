package main.controller;

import main.model.User;
import main.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUser() {
        User user = new User();

        userRepository.save(user);
        Assert.assertNotNull(user);
    }
}
