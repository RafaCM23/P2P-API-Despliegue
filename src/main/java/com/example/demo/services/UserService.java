package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.security.JWTUtil;



@Service
public class UserService {

	@Autowired private JWTUtil jwtUtil;

	@Autowired private UserRepo userRepo;
	
	
}
