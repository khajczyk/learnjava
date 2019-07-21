package com.sda.learnjava.learnjava.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "QUIZ")
public class Quiz {

    @Id
    @GeneratedValue
    private long id;

    private String question;
    private Level level;
    private String answer;
}
