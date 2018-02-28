package com.Mycrud.Mycrud.copy;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController 
{
	@Autowired
	private CourseService readservice;
	
	@RequestMapping("/read/{id}/course")
	public List<Course> getAllTopics()
	{
		return readservice.getAllCourses();
	}
	
	@RequestMapping("/read/{topicId}/course/{id}")
	public Course getCourse(@PathVariable String id)
	{
		return readservice.getCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/course")
	public void add(@RequestBody Course course,@PathVariable String topicId)
	{
		readservice.add(course);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/update/{id}")
	public void update(@RequestBody Course topic,@PathVariable String id)
	{
		readservice.update(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{topicId}/course/{id}")
	public void delete(@PathVariable String id)
	{
		readservice.deleteById(id);
	}
	
}
