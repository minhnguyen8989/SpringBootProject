package com.minhnguyen.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minhnguyen.springbootproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can also define custom methods like:
    User findByEmail(String email);
}
