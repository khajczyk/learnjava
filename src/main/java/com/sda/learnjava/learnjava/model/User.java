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


    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    @ManyToMany
    private List<UsersAnswers> userAnswers = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UsersAnswers> usersAnswers;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
}
