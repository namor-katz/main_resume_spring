package com.katzendorn.resume.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@Entity
@Table(name = "skills")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String Image;

    @Enumerated(EnumType.STRING)
    private Weigth weigth;

    public enum Weigth {
        //переделать на int's
        HIGH, MEDIUM, LOW
    }

    @OneToMany
    private Set<Course> courses; //== certificats

    @OneToMany
    private Set<Project> projects;
}
