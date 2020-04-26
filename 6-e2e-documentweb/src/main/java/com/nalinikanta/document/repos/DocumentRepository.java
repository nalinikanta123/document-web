package com.nalinikanta.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nalinikanta.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
