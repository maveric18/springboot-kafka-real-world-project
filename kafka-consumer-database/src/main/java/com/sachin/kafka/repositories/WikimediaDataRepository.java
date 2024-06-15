package com.sachin.kafka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.kafka.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
