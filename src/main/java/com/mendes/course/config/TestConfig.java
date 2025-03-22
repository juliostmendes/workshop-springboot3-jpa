package com.mendes.course.config;

import com.mendes.course.entities.Category;
import com.mendes.course.entities.Order;
import com.mendes.course.entities.User;
import com.mendes.course.entities.enums.OrderStatus;
import com.mendes.course.repositories.CategoryRepository;
import com.mendes.course.repositories.OrderRepository;
import com.mendes.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Tools");
        Category c3 = new Category(null, "Garden");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "11999995555", "senha1234");
        User u2 = new User(null, "Carlos Brown", "carlos@gmail.com", "11999992255", "Senha9090");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED,u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID ,u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
