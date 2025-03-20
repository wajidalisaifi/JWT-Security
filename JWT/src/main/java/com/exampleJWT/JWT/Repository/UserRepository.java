package com.exampleJWT.JWT.Repository;

import com.exampleJWT.JWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    public Optional<User> findByName(String UserName);
}
