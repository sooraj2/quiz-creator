package com.sooraj.quizcreator.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;


@Data
@NoArgsConstructor
@ToString
@Entity
public class Quiz {

    @Id
    private Long id;
    private String title;
    private Long points;
    private Date date;

    public Quiz(Long id, String title, Long points, Date date) {
        this.id = id;
        this.title = title;
        this.points = points;
        this.date = date;
    }
}
