package com.example.ex.lesson06.ajax01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson06")
public class UserController {

	@Autowired
	private UserBO userBO;
	
	@RequestMapping("/ajax01")
	public String ex01() {
		return "/lesson06/ajax01";
	}
	
	// 유저 추가
	// 요청 URL: http://localhost/lesson06/ex01/add_user
	@PostMapping("/ex01/add_user")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "introduce", required=false) String introduce) {
		
		userBO.addNewUser(name, yyyymmdd, introduce, email);
		return "success";
	}
}
