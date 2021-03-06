package com.OodlesCrudApp.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OodlesCrudApp.main.SubjectRepository;
import com.OodlesCrudApp.main.Subjects;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subjects> getAllSubjects() {

		List<Subjects> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public Subjects getSubject(String id) {
		
		return subjectRepository.findOne(id);

	}

	public void addSubject(Subjects topic) {
		subjectRepository.save(topic);

	}

	public void updateSubject(Subjects subject,String id) {

		subjectRepository.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectRepository.delete(id);
		
	}


}
