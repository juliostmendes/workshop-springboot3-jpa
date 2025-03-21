package com.mendes.course.config;

import com.mendes.course.entities.User;
import com.mendes.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "11999995555", "senha1234");
        User u2 = new User(null, "Carlos Brown", "carlos@gmail.com", "11999992255", "Senha9090");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
