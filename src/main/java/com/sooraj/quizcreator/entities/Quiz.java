package com.sooraj.quizcreator.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Data
@NoArgsConstructor
@ToString
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Long points;
    private Long timeDuration;
    private Date date;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Question> questions;

    public Quiz(Long id, String title, Long points, Long timeDuration, Date date) {
        this.id = id;
        this.title = title;
        this.points = points;
        this.timeDuration = timeDuration;
        this.date = date;
    }

}
