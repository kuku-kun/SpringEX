package com.example.ex.lesson06.ajax02;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06")
@Controller
public class User2Controller {

	@Autowired
	private User2BO userBO;
	
	@RequestMapping("/ajax02")
	public String ajax02() {
		return "lesson06/ajax02";
	}
	
	@GetMapping("/is_duplication")
	@ResponseBody
	public Map<String, Boolean> isDuplication(
			@RequestParam("name") String name){
		Map<String,Boolean> result = new HashMap<>();
		result.put("is_duplication", userBO.existUserByName(name));
		return result;
	}
}
