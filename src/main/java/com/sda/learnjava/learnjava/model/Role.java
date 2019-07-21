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
@Table(name = "ROLE")
public class Role {


    @Id
    @GeneratedValue
    private long id;

    private String name;

}
