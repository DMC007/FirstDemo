package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public String add() {
		User user = new User();
		user.setName("Rose");
		user.setAge(23);
		user.setEmail("rose@163.com");
		
		userService.add(user);
		
		return "add success";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") Integer id) {
		User user = userService.findById(id);
		user.setName("傻逼");
		userService.update(user);
		return "update success";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		User user = userService.findById(id);
		
		userService.delete(user);
		return "delete success";
	}
}
