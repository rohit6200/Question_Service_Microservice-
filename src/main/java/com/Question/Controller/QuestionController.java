package com.Question.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Question.Entity.Question;
import com.Question.Service.QuestionService;

@RestController
@RequestMapping("/Question")
public class QuestionController {
	
	private final QuestionService questionService;
	

	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}

	
	@PostMapping
	public Question create(@RequestBody Question question)
	{
		return questionService.create(question);
	}
	
	@GetMapping
	public List<Question> get()
	{
		return questionService.get();
	}
	
	
	@GetMapping("/{Questionid}")
	public Question getOne(@RequestBody Long Questionid)
	{
		return questionService.getOne(Questionid);
	}
	
	@GetMapping("/quiz/{quizid}")
	public List<Question> getQuestionofQuizid(@PathVariable Long quizid)
	{
		return questionService.getQuestionofQuizid(quizid);
	}

}
