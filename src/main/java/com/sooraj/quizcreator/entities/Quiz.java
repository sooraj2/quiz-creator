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
    private Long duration;
    private Date deadline;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Question> questions;

    public Quiz(Long id, String title, Long points, Long duration, Date deadline) {
        this.id = id;
        this.title = title;
        this.points = points;
        this.duration = duration;
        this.deadline = deadline;
    }

}
