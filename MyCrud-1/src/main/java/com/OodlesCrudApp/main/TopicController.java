package com.OodlesCrudApp.main;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.OodlesCrudApp.Subjects.Subjects;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/subjects/{subjectId}/topic")
	public List<Topic> getAllTopics(@PathVariable String subjectId) {
		return topicService.getAllTopics(subjectId);
	}
	
	@RequestMapping("/subjects/{id}/topic")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/subject/{subjectId}/topics")
	public void addTopic(@RequestBody Topic topic,@PathVariable String subjectId) {
		topic.setSubjects(new Subjects(subjectId,"",""));
		 topicService.addTopic(topic);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/subjects/{subjectId}/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String subjectId,@PathVariable String id) {
		
		topic.setSubjects(new Subjects(subjectId,"",""));
		topicService.updateTopic(topic);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String id) {
		 topicService.deleteTopic(topic,id);
		
		
	}

}