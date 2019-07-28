package com.sda.learnjava.learnjava.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Level {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String level;



    @OneToMany(mappedBy = "level")
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "level")
    private List<User> users;

    @OneToMany(mappedBy = "level")
    private List<UsersAnswers> usersAnswers;

    @OneToMany(mappedBy = "level")
    private List<Question> questions;

}   
