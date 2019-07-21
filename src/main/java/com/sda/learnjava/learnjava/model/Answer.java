package com.sda.learnjava.learnjava.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ANSWERS")
public class Answer {


    @Id
    @GeneratedValue
    private long id;

    private long correctAnswer;

    @OneToOne(mappedBy = "answer")
    private List<Answer> answers;


}
