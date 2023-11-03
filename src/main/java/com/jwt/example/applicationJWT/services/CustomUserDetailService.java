package com.jwt.example.applicationJWT.services;

import com.jwt.example.applicationJWT.entity.User;
import com.jwt.example.applicationJWT.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //load user from database
        return userRepository.findByemail(username).orElseThrow(()-> new RuntimeException("User Not found !!!"));
    }
}
