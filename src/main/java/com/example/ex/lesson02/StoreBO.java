package com.example.ex.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreBO {
	
	@Autowired
	private StoreDAO storeDAO;

	public List<Store> selectStoreList(){
		return storeDAO.selectStore();
	}
}
