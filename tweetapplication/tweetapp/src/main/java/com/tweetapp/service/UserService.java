package com.tweetapp.service;

import java.util.List;
import java.util.regex.Matcher;

import com.tweetapp.constants.BatchConstants;
import com.tweetapp.dao.UserDaoSqlImpl;
import com.tweetapp.model.User;
import com.tweetapp.util.DateUtil;

public class UserService {

	UserDaoSqlImpl repo = new UserDaoSqlImpl();

	public boolean validateUser(String email, String password) throws Exception {
		User existedUser = repo.getUser(email);
		if (existedUser != null) {
			if (existedUser.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new Exception();
		}
	}

	public boolean validateEmail(String email) throws Exception {
		User existedUser = repo.getUser(email);
		if (existedUser != null) {
			if (existedUser.getEmail().equals(email)) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new Exception();
		}
	}

	public void saveUser(String fname, String lname, String gender, String dob, String email, String pwd)
			throws Exception {
		User newUser = new User(fname, lname, gender, DateUtil.convertToDate(dob), email, pwd);
		repo.saveUser(newUser);
	}

	public void resetPassword(String email, String password) throws Exception {
		repo.resetPassword(email, password);
	}

	public List<String> getAllUsers() {
		return repo.getAllUsers();
	}
}