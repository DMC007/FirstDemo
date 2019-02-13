package com.example.service;

import com.example.entity.User;

public interface UserService {
	
	void add(User user);

	User findById(Integer id);

	void update(User user);

	void delete(User user);
}
