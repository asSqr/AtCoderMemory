package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CSubmissionUrl;

@Repository
public interface CSubmissionUrlRepository extends JpaRepository<CSubmissionUrl, String> {

}
