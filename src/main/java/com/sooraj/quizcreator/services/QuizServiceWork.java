package com.sooraj.quizcreator.services;

import com.sooraj.quizcreator.dao.ChoiceDao;
import com.sooraj.quizcreator.dao.QuestionDao;
import com.sooraj.quizcreator.dao.QuizDao;
import com.sooraj.quizcreator.entities.Choice;
import com.sooraj.quizcreator.entities.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Service
public class QuizServiceWork implements QuizService{

        @Autowired
        private QuizDao quizDao;

        @Autowired
        private QuestionDao questionDao;

        @Autowired
        private ChoiceDao choiceDao;

        public QuizServiceWork() {
          }

    @Override
    public List<Quiz> getQuizzes() {
         return quizDao.findAll();
    }

    @Override
    public Quiz addQuiz(Quiz quiz) {
        quizDao.save(quiz);
            return quiz;

    }

}
