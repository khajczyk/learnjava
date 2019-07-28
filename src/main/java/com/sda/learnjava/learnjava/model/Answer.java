package com.sda.learnjava.learnjava.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ANSWERS")
public class Answer {


    @Id
    @GeneratedValue
    @Column(name = "answer_id")
    private long id;

    private String description;

    private boolean isTrue;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Answer(String description, boolean isTrue) {
        this.description = description;
        this.isTrue = isTrue;
    }
}
