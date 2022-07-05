package com.example.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	
	@RequestMapping("/test1")
	public String hellWorld() {
		return "Hello world!";
	}
	
	@RequestMapping("/lesson01/ex02/1")
	public String ex02() {
		return "lesson01/ex02";
	}

	@RequestMapping("/lesson01/ex02/2")
	public String ex03() {
		return "lesson01/ex03";
	}
}
