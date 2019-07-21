package com.sda.learnjava.learnjava.model;

import javax.persistence.*;

@Entity
@Table(name = "QUESTIONS")
public class Question {

    @Id
    @GeneratedValue
    private long id;

    private String question;

    private Level level;

    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
}
