package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void add(User user) {
		userMapper.insert(user);
	}

	@Override
	public User findById(Integer id) {
		User user = userMapper.selectById(id);
		return user;
	}

	@Override
	public void update(User user) {
		userMapper.updateById(user);
	}

	@Override
	public void delete(User user) {
		userMapper.deleteById(user);
	}

}
