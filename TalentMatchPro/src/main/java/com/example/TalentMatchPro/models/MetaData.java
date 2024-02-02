package com.example.TalentMatchPro.models;

import com.example.TalentMatchPro.Enums.ExperienceLevel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class MetaData {
    String author;
    Date creationDate;
    String keywords;
}
