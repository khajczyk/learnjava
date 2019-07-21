package com.sda.learnjava.learnjava.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@Table(name = "USER")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    private String nickName;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private Level level;

    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    @JoinTable(name = "user_answers",
            joinColumns = @JoinColumn(name = "useranswers_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))

    @ManyToMany
    private List<UserAnswers> userAnswers = new ArrayList<>();

}
