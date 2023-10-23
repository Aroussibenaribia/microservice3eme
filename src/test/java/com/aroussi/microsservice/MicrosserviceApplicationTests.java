package com.aroussi.microsservice;

import com.aroussi.microsservice.entities.User;
import com.aroussi.microsservice.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicrosserviceApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void testAddUser() {
        User user = new User(null, "khalil", "1234", true, null);
        userService.saveUser(user);
        System.out.println(user);
    }
}
