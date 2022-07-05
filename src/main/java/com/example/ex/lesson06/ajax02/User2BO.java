package com.example.ex.lesson06.ajax02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User2BO {

	@Autowired
	private User2DAO userDAO;
	
	public void addNewUser(String name, String yyyymmdd, String introduce, String email) {
		userDAO.insertUser(name, yyyymmdd, introduce, email);
	}
	
	public boolean existUserByName(String name) {
		return userDAO.existNewUserByName(name);
	}
}
