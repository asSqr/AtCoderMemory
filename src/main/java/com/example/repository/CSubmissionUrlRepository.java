package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CSubmissionUrl;

@Repository
public interface CSubmissionUrlRepository extends JpaRepository<CSubmissionUrl, String> {

	public List<CSubmissionUrl> findByCardsUuid( String uuid );

}
