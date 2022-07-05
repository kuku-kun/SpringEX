package com.example.ex.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	
	@Autowired
	private StoreBO storeBO;
	
	@RequestMapping(value="/lesson02/quiz01")
	public List<Store> quiz01(){
		List<Store> result = storeBO.selectStoreList();
		return result;
	}
}
