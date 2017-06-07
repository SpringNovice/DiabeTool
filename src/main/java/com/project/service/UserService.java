package com.project.service;

import java.util.List;

import com.project.model.User;

public interface UserService {
	public User findUserByEmail(String email);

	public User getUserById(long id);

	public List<User> getAllUsers();

	public void saveUser(User user);
}
