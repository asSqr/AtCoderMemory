package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CCard;

@Repository
public interface CCardRepository extends JpaRepository<CCard, String> {

}
