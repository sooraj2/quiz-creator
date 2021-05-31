package com.sooraj.quizcreator.services;

import com.sooraj.quizcreator.entities.Choice;
import com.sooraj.quizcreator.entities.Quiz;

import java.util.List;

public interface QuizService {

    public List<Quiz> getQuizzes();

    public Quiz addQuiz(Quiz quiz);

    public Choice addChoice(Choice choice);





}
