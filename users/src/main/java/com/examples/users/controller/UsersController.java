package com.examples.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.users.bean.Users;

@RestController
@RequestMapping("/users")
public class UsersController {

	@GetMapping("/{number}")
	public Users getUser(@PathVariable long number) {
		return new Users(Integer.valueOf(""+number), "Meghana", "Password","Vidyanagar,Shimoga");
	}

}
