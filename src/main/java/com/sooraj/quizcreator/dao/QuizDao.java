package com.sooraj.quizcreator.dao;

import com.sooraj.quizcreator.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Long> {


}
