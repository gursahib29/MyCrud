package com.Mycrud.Mycrud.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Update 

{
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/update")
	public String update()
	{ 
		String hitman="hitman";
		String update="update employe set id_no=420 where name ='"+hitman+"'";
		jdbc.execute(update);
		return "updated successfully";
	}

}
