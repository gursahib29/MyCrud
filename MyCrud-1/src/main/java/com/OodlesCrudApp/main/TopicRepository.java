package com.OodlesCrudApp.main;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface TopicRepository extends CrudRepository<Topic,String>{
	List<Topic> findBySubjectsId(String subjectId);
	

}
