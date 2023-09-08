package com.talzoomanzoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talzoomanzoo.exception.UserException;
import com.talzoomanzoo.model.User;
import com.talzoomanzoo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public User findUserById(Long userId) throws UserException {
		// TODO Auto-generated method stub
		User user=userRepository.findById(userId).orElseThrow(()-> new UserException("user not found with id" + userId));
		return null;
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Long userId, User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User followUser(Long userId, User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUser(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
