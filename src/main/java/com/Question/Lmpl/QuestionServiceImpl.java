package com.Question.Lmpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.Question.Entity.Question;
import com.Question.Repository.QuenstionRepository;
import com.Question.Service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	private final QuenstionRepository questionRepository;

	public QuestionServiceImpl(QuenstionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	@Override
	public Question create(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		return questionRepository.findAll();

	}

	@Override
	public Question getOne(Long id) {
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question Not Found !!"));
	}

	@Override
	public List<Question> getQuestionofQuizid(Long quizid) {
		return questionRepository.findByQuizid(quizid);
	}

}
