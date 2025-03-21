package com.mendes.course.repositories;

import com.mendes.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Using the annotation @Repository in this case is optional,
// because this interface already extends a JpaRepository that
// is a Spring component
public interface UserRepository extends JpaRepository<User, Long> {
}
