package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.ExperienceLevel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class MetaData {
    String author;
    Date creationDate;
    List<String> keywords;
}
