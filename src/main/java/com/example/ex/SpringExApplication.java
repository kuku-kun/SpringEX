package com.example.ex;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.example")   // com.example 패키지 아래에 있는 스프링빈들 탐색
@MapperScan(basePackages = "com.example.*")  // mapper scan 추가!!!
@SpringBootApplication // 스프링 구동을 위한 필수 어노테이션
public class SpringExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExApplication.class, args);
	}

	 @Bean
	 public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	     SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	     sessionFactory.setDataSource(dataSource);

	     Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
	     sessionFactory.setMapperLocations(res);

	     return sessionFactory.getObject();
	 }
	 
}
