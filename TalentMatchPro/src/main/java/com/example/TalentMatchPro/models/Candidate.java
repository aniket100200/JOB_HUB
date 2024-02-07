package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.JobApplicationStatus;
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
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String contactNo;

    byte[]resume;

    String skills;

    String exprience;

    String education;

    @Enumerated(EnumType.STRING)
    JobApplicationStatus jobApplicationStatus;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL)
    List<Document>documentList=new ArrayList<>();

    @ManyToOne
    @JoinColumn
    JobRecruitment jobRecruitment;

    @OneToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Client client;

    @ManyToOne
    @JoinColumn
    Agent agent;

}
