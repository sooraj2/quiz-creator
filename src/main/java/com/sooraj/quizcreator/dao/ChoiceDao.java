package com.sooraj.quizcreator.dao;

import com.sooraj.quizcreator.entities.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoiceDao extends JpaRepository<Choice,Long>{

}
