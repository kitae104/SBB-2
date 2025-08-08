package com.mysite.sbb.answer.controller;

import com.mysite.sbb.question.entity.Question;
import com.mysite.sbb.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {

  private final QuestionService questionService;

  @PostMapping("/create/{id}")
  public String createAnswer(@PathVariable Long id, @RequestParam("content") String content) {
    Question question = questionService.getQuestion(id);
    // TODO: 답변 저장 기능
    log.info("Creating answer for question ID: {}, content: {}", id, content);
    return "redirect:/question/detail/" + id;
  }

}
