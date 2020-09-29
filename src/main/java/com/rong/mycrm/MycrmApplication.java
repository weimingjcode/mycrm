package com.rong.mycrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rong.mycrm"})
@MapperScan(basePackages = {"com.rong.mycrm.mapper"})
public class MycrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycrmApplication.class, args);
	}

}
