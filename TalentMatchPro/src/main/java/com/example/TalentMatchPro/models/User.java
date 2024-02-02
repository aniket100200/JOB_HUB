package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.Status;
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

    String regNo; //this will be an UUID
//    Status (active/inactive)
    @Enumerated(EnumType.STRING)
    Status status;

    //    Role (e.g., Super Admin, Admin, Recruiter)
}
