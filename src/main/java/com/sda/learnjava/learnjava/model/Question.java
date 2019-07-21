package com.sda.learnjava.learnjava.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTIONS")
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "question_id")
    private long id;

    private String question;


    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
}
