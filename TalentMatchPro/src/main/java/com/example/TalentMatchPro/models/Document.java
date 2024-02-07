package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "document")
public class Document {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    @Column(name="document_name")
    String name;



    @Column(name="date")
    @CreationTimestamp
    Date uploadedDate;

    @Column(name="doc_type")
    @Enumerated(EnumType.STRING)
    DocumentType docType; //(resume,job description)
    @Column(name="file_path")
    String filePath;

    @Column(name="meta_data_string")
    String metaDataString;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Candidate candidate;


    @ManyToOne
    @JoinColumn
    JobRecruitment jobRecruitment;

}
