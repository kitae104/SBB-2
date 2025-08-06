package com.mysite.sbb.answer.repository;

import com.mysite.sbb.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRespository extends JpaRepository<Question,Long> {
}
