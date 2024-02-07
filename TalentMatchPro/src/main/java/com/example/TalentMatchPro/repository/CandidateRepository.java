package com.example.TalentMatchPro.repository;

import com.example.TalentMatchPro.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
}
