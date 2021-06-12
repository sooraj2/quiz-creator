package com.sooraj.quizcreator.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@ToString
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private Boolean IsSingleChoice;
    private String points;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Choice> choices;

    public Question(Long id, String description, Boolean IsSingleChoice, String points) {
        this.id = id;
        this.description = description;
        this.IsSingleChoice = IsSingleChoice;
        this.points = points;
    }

}
