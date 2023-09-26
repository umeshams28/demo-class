package com.dem0.democurd.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dem0.democurd.entity.User;
import com.dem0.democurd.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRescontroler {
	

	@Autowired
	private UserService userService;
	

	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return "saved data";
	}
	

	@GetMapping("/getuser/{id}")
	public User getUserById(@PathVariable("id") int id) {

		User user = userService.getuserById(id);
		return user;
		
	}

}
