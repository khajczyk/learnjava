package com.sda.learnjava.learnjava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Level {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "quiz")
    private String level;

}   
