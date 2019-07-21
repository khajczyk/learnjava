package com.sda.learnjava.learnjava.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USERANSWERS")
public class UserAnswers {


    @Id
    @GeneratedValue
    @Column(name = "useranswers_id")
    private long id;


    private LocalDate localDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Quiz quizId;

}
