package com.sda.learnjava.learnjava.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USERANSWERS")
public class UsersAnswers {

    @Id
    @GeneratedValue
    @Column(name = "useranswer_id")
    private long id;

    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    private int score;

}
