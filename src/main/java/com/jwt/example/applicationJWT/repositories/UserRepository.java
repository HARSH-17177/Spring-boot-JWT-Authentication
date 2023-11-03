package com.jwt.example.applicationJWT.repositories;

import com.jwt.example.applicationJWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {

    public Optional<User> findByemail(String email);
}
