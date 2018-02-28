package com.Mycrud.Mycrud;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController   //The @RestController is a stereotype annotation. It adds @Controller and @ResponseBody annotations to the class. We need to import org.springframework.web.bind.annotation package in our file, in order to implement it.


public class delete 
{
	
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/delete")
	public String delete()
	{
		String delete="truncate employe";
		jdbc.execute(delete);
		return "deleted successfully";
	}

}
