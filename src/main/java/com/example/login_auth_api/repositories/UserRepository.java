package com.example.login_auth_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.login_auth_api.domain.user.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
