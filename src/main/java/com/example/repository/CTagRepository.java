package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CTag;

@Repository
public interface CTagRepository extends JpaRepository<CTag, String> {

}