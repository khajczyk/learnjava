package com.sda.learnjava.learnjava.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "QUIZ")
public class Quiz {

    @Id
    @GeneratedValue
    @Column(name = "quiz_id")
    private long id;

    private Level level;

    @OneToMany
    private Set<Question> questions = new HashSet<>();

    @OneToMany(mappedBy = "quiz")
    private List<UsersAnswers> usersAnswers;


}
