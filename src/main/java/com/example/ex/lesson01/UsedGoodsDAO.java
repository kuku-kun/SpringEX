package com.example.ex.lesson01;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ex.lesson01.ex01.DTO.UsedGoods;

@Repository
public interface UsedGoodsDAO {

	public List<UsedGoods> selectUsedGoodsList();
}
