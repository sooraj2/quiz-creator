package com.sooraj.quizcreator.dao;

import com.sooraj.quizcreator.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionDao extends JpaRepository<Question,Long> {

}
