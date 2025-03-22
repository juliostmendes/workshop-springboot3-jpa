package com.mendes.course.repositories;

import com.mendes.course.entities.Order;
import com.mendes.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
