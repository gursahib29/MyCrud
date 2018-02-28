package com.OodlesCrudApp.main;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService  {

	@Autowired
	private TopicRepository professorRepository;

	public List<Topic> getAllTopics(String subjectId) {

		List<Topic> professor = new ArrayList<>();
		 professorRepository.findBySubjectsId(subjectId).forEach(professor::add);
		return professor;
	}

	public Topic getTopic(String id) {
		
		return professorRepository.findOne(id);

	}

	public void addTopic(Topic topic) {
		professorRepository.save(topic);

	}

	public void updateTopic(Topic topic) {

		professorRepository.save(topic);
		
	}

	public void deleteTopic(Topic professor,String id) {
		professorRepository.delete(id);
		
	}

}
