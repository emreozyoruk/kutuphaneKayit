package com.emre.LibraryManagementProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emre.LibraryManagementProject.entity.Publisher;

import java.util.Optional;

@Repository
public interface  PublisherRepository extends JpaRepository<Publisher,Long> {
    Optional<Publisher> findByNameAndEstablishmentYear(String name, Integer year);
}
