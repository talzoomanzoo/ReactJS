package com.talzoomanzoo.service;

import java.util.List;

import com.talzoomanzoo.exception.UserException;
import com.talzoomanzoo.model.User;

public interface UserService {

		public User findUserById(Long userId) throws UserException;
		
		public User findUserProfileByJwt(String jwt) throws UserException;
		
		public User updateUser(Long userId, User user) throws UserException;
		
		public User followUser(Long userId, User user) throws UserException;
		
		public List<User> searchUser(String query);
		
		
}
