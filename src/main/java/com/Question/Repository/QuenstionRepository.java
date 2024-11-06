package com.Question.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Question.Entity.Question;

public interface QuenstionRepository extends JpaRepository<Question, Long>{
	
	List<Question> findByQuizid(Long quizid);
	

}
