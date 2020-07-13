package com.katzendorn.resume.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String CertificatIMG;

    private String CertificatPDF;   //from download

    private String CertificatURL;

    private String DateStart;

    private String DateFinal;

}
