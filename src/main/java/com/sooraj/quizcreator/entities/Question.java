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
public class Question {

    @Id
    private Long id;
    private String description;
    private String type;
    private String points;

    @ManyToOne
    private Quiz quiz;

    public Question(Long id, String description, String type, String points) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.points = points;
    }

}
