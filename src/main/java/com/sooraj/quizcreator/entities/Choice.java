package com.sooraj.quizcreator.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Choice {

    @Id
    private Long id;
    private String choice_description;
    private Boolean correct;

    @ManyToOne
    private Question question;

    public Choice(Long id, String choice_description, Boolean correct) {
        this.id = id;
        this.choice_description = choice_description;
        this.correct = correct;
    }
}
