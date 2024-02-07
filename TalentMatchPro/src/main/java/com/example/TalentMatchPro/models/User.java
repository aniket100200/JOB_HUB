package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.Role;
import com.example.TalentMatchPro.Enums.Status;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String username;

    @Column(nullable = false,unique = true)
    String email;

    @Column(nullable = false)
    String password;

    String organization;
//    Registration Number

    @Column(nullable = false,unique = true)
    String regNo; //this will be an UUID

//    Status (active/inactive)
    @Enumerated(EnumType.STRING)
    Status status; //we'll add this during Creation of User..

    //Role (e.g., Super Admin, Admin, Recruiter)
    @Enumerated(EnumType.STRING)
    Role role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Client>clientList=new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Agent>agentList=new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Document>documentList=new ArrayList<>();


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<JobRecruitment>jobRecruitmentList=new ArrayList<>();

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    Candidate candidate;


}
