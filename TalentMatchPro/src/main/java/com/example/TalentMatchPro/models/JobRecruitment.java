package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.ExperienceLevel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class JobRecruitment {
    /*
    * ID (unique identifier)
Title
Description
Required skills
Experience level
Salary range
Client/Agent association*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    String description;

    String skills; //Comma separated value..

    @Enumerated(EnumType.STRING)
    ExperienceLevel experienceLevel;

    Double salary;



}
