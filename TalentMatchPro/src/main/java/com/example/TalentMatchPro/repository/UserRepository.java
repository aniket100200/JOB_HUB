package com.example.TalentMatchPro.repository;

import com.example.TalentMatchPro.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
