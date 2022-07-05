package com.example.ex.lesson01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex.lesson01.ex01.DTO.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	public List<UsedGoods> getUsedGoodsList(){
		return usedGoodsDAO.selectUsedGoodsList();
	}
}
