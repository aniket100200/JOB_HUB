package com.example.TalentMatchPro.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "agent")
public class Agent {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    @Column(name = "agent_name")
    String agent_name;
    @Column(name = "mobile_no", nullable = false,unique = true)
    String mob_no;


}
