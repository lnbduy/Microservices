package com.duyle.rentclound.authorizationserver.repository;

import com.duyle.rentclound.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
