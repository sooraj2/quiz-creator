package com.sooraj.quizcreator.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String textChoice;
    private Boolean isCorrect;

    public Choice(Long id, String textChoice, Boolean isCorrect) {
        this.id = id;
        this.textChoice = textChoice;
        this.isCorrect = isCorrect;
    }
}
