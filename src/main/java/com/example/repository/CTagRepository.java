package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CTag;

@Repository
public interface CTagRepository extends JpaRepository<CTag, String> {

	List<CTag> findByCardsUuid( String uuid );

}