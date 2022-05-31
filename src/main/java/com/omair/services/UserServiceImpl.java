package com.omair.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omair.entity.User;
import com.omair.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	@Override
	public User getUserById(Integer userId) {
		return userRepository.findById(userId).get();
	}
	@Override
	public void deleteUserById(Integer userId) {
		userRepository.deleteById(userId);
	}
	@Override
	public User updateUserById(Integer userId, User user) {
		User updatedUser = userRepository.findById(userId).get();
		
		updatedUser.setlName(user.getlName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.sethPhone(user.gethPhone());
		updatedUser.setoPhone(user.getoPhone());
		updatedUser.setpPhone(user.getpPhone());
		
		return userRepository.save(updatedUser); 
	}
	@Override
	public List<User>getUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findBylName(name);
	}
	
	@Override
	public List<User> getAllUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailAddress(email);
	}
	
	
	public List<User>findUserBySearch(User user) {
		//User findUser = userRepository.findById(user.getId()).get();
		System.out.println(user.getEmail() + "Hello Message");
		return userRepository.findBySearch(user.getEmail(),
											user.gethPhone(),
											user.getoPhone(),
											user.getpPhone(),
											user.getlName());
	}
}
