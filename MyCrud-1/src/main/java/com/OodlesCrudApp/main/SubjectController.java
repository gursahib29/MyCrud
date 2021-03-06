package com.OodlesCrudApp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/subjects")
	public List<Subjects> getAllSubject() {
	
		return subjectService.getAllSubjects();
	}
	
	@RequestMapping("/subjects/{id}")
	public Subjects getSubject(@PathVariable String id) {
		return subjectService.getSubject(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/subject")
	public void addSubject(@RequestBody Subjects subject) {
		 subjectService.addSubject(subject);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/subject/{id}")
	public void updateSubject(@RequestBody Subjects topic,@PathVariable String id) {
		 subjectService.updateSubject(topic,id);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/subject/{id}")
	public void deleteSubject(@PathVariable String id) {
		subjectService.deleteSubject(id);
		
		
	}

}