package com.sda.learnjava.learnjava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Level {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "level")
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "level")
    private List<User> users;

    @OneToMany(mappedBy = "level")
    private List<UsersAnswers> usersAnswers;

    @OneToMany(mappedBy = "level")
    private List<Question> questions;

}   
