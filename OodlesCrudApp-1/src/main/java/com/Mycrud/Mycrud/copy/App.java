package com.Mycrud.Mycrud.copy;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController

public class App 
{

	@Autowired     //Autowiring feature of spring framework enables you to inject the object dependency implicitly. It internally uses setter or constructor injection.

//Autowiring can't be used to inject primitive and string values. It works with reference only.


	JdbcTemplate jdbc;
	@RequestMapping( "/insert")
	public String home()
	{
		String sql="insert into employe values(1,'hitman')";
		jdbc.execute(sql);
		return "data inserted";	
	}
	

}
