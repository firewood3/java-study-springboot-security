package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class GenPassword {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void genPassword() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bCryptPasswordEncoder.encode("password");
        boolean password1 = bCryptPasswordEncoder.matches("passwor1d", "$2a$10$AAS5tk9COnI1gTFx.hGU2urYUReo6AMeZ7ucfk3b1I0qUZgorpd.S");
        System.out.println(password1);
        System.out.println(password);
    }
}
