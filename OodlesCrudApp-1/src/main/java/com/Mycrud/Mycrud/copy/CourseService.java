package com.Mycrud.Mycrud.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService
{
	@Autowired
	CourseRepository courseRepository;
		
		
		public List<Course> getAllCourses()
		{
			
			List<Course> courses=new ArrayList<>();
			courseRepository .findAll()
			 .forEach(courses::add);
			
			return courses;
		}
		
		public Course getCourse(String id)
		{
			
			
			return courseRepository.findOne(id);
		}

		public void add(Course course) 
		{
			courseRepository.save(course);
		}

		public void update(String id,Course course) {
			
			courseRepository.save(course);
			
			
		}

		public void deleteById(String id) 
		{
			courseRepository.delete(id);
			
		}

}
