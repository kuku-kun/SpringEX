package com.example.ex.lesson02;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO {
	
	public List<Store> selectStore();

}
