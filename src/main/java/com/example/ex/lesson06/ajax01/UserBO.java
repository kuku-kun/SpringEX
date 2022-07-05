package com.example.ex.lesson06.ajax01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBO {

	@Autowired
	private UserDAO userDAO;
	
	public void addNewUser(String name, String yyyymmdd, String introduce, String email) {
		userDAO.insertNewUser(name, yyyymmdd, introduce, email);
	}
}
