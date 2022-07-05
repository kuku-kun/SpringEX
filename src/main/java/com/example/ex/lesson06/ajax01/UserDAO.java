package com.example.ex.lesson06.ajax01;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

	public void insertNewUser(
			@Param("name") String name,
			@Param("yyyymmdd") String yyyymmdd,
			@Param("introduce") String introduce,
			@Param("email") String email);
}
