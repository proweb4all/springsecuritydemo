package ru.proweb4all.springsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.proweb4all.springsecuritydemo.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
