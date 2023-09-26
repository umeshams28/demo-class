package com.dem0.democurd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dem0.democurd.entity.User;
import com.dem0.democurd.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void saveUser(User user) {

		userRepository.save(user);
	}

	public User getuserById(int id) {
		
		Optional<User> optional = userRepository.findById(id);
		return optional.get();
	}
}
