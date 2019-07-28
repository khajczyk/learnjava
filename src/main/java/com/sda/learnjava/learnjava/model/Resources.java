package com.sda.learnjava.learnjava.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "RESOURCES")
public class Resources {


    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String author;

    private String description;

    private String link;

    private String review;

    private String cover;

    private Type type;

}
