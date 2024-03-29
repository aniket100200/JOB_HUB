package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.ExperienceLevel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class JobRecruitment {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    String description;

    String skills; //Comma separated value..

    @Enumerated(EnumType.STRING)
    ExperienceLevel experienceLevel;

    Double salary;

    @ManyToOne
    @JoinColumn
    User  user;

    @ManyToOne
    @JoinColumn
    Client client;

    @OneToMany(mappedBy = "jobRecruitment",cascade = CascadeType.ALL)
    List<Candidate>candidateList=new ArrayList<>();

    @ManyToOne
    @JoinColumn
    Agent agent;

    @OneToMany(mappedBy = "jobRecruitment",cascade = CascadeType.ALL)
    List<Document>documentList=new ArrayList<>();


}
