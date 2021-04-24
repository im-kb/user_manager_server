package com.example.user_manager.repository;

import com.example.user_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.user_manager.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}