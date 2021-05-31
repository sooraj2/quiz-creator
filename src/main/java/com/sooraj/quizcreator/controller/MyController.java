package com.sooraj.quizcreator.controller;


import com.sooraj.quizcreator.entities.Quiz;
import com.sooraj.quizcreator.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/")
    public String home(){
        return "hello world";
    }

    @GetMapping("/quizzes")
    public List<Quiz> getQuizzes(){

        return this.quizService.getQuizzes();
    }

    @CrossOrigin
    @PostMapping("/quiz")
    public Quiz addQuiz(@RequestBody Quiz quiz){

        return this.quizService.addQuiz(quiz);
    }

}
