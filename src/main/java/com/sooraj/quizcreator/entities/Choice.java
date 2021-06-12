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
    private String choice_description;
    private Boolean Iscorrect;

    public Choice(Long id, String choice_description, Boolean Iscorrect) {
        this.id = id;
        this.choice_description = choice_description;
        this.Iscorrect = Iscorrect;
    }
}
