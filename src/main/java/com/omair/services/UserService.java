package com.omair.services;

import java.util.List;

import com.omair.entity.User;

public interface UserService {
	public User createUser(User user);
	public List<User>getUsers();
	public User getUserById(Integer userId);
	public void deleteUserById(Integer userId);
	public User updateUserById(Integer userId, User user);
	public List<User>getAllUserByEmail(String email);
	public List<User>getUserByName(String name);
	
	public List<User>findUserBySearch(User user);
}
