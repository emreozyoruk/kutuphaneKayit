package com.emre.LibraryManagementProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emre.LibraryManagementProject.entity.BookBorrowing;

@Repository
public interface  BookBorrowingRepository extends JpaRepository<BookBorrowing,Long> {
}
