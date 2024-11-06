package com.Question.Service;

import java.util.List;

import com.Question.Entity.Question;

public interface QuestionService {
	
	Question create(Question question);
	
	List<Question> get();
	
	Question getOne(Long id);

	List<Question> getQuestionofQuizid(Long quizid);
}
