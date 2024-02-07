package com.example.TalentMatchPro.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "client")
public class Client {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    @Column(name = "client_name")
    String client_name;
    @Column(name = "mobile_no", nullable = false,unique = true)
    String mob_no;

    @ManyToOne
    @JoinColumn
    User user;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    List<JobRecruitment> jobRecruitmentList=new ArrayList<>();


    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    List<Candidate>candidateList=new ArrayList<>();

}
