package com.example.ex.lesson06.ajax02;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface User2DAO {

	public void insertUser(
			@Param("name") String name,
			@Param("yyyymmdd") String yyyymmdd,
			@Param("introduce") String introduce,
			@Param("email") String email);
	
	public boolean existNewUserByName(@Param("name") String name);
}
