package com.mysite.sbb.answer.repository;

import com.mysite.sbb.answer.entity.Answer;
import com.mysite.sbb.question.entity.Question;
import com.mysite.sbb.question.repository.QuestionRepository;
import com.mysite.sbb.question.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnswerRespositoryTest {

    @Autowired
    private AnswerRespository answerRespository;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testFindById() {
        Optional<Question> oq = questionRepository.findById(1L);
        assertTrue(oq.isPresent());
        Question question = oq.get();

        Answer answer = new Answer();
        answer.setContent("네 자동으로 생성됩니다.");
        answer.setQuestion(question);
        answer.setCreated(LocalDateTime.now());
        Answer saved = answerRespository.save(answer);
        assertEquals(saved.getId(), 1L);
    }

    @Transactional
    @Test
    void testGetAnswerList() {
        Optional<Question> oq = questionRepository.findById(1L);
        assertTrue(oq.isPresent());
        Question question = oq.get();

        List<Answer> answerList = question.getAnswerList();

        assertEquals(answerList.size(), 1);

        assertEquals(1, question.getAnswerList().size());
    }
}