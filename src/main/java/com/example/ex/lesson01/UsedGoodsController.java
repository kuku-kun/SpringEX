package com.example.ex.lesson01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex.lesson01.ex01.DTO.UsedGoods;

@RestController
public class UsedGoodsController {

	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01(){
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		return usedGoodsList;
	}
}
