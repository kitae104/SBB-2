package com.mysite.sbb.question.controller;

import com.mysite.sbb.question.entity.Question;
import com.mysite.sbb.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

  private final QuestionService questionService;  // 반드시 final로 선언해야 함

  @GetMapping("/list")
  public String list(Model model) {
    List<Question> questionList = questionService.getList();
    model.addAttribute("questionList", questionList);
//    model.addAttribute("data", "전달할 데이터"); // 데이터 전달
    return "question/list_ex1";
  }

  @GetMapping("/detail/{id}")
  public String detail(@PathVariable("id") Long id, Model model) {
    Question question = questionService.getQuestion(id);
    model.addAttribute("question", question);
    return "question/detail_ex2";
  }
}
