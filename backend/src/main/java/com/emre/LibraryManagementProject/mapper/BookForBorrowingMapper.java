package com.emre.LibraryManagementProject.mapper;

import org.mapstruct.Mapper;

import com.emre.LibraryManagementProject.dto.request.BookForBorrowingRequest;
import com.emre.LibraryManagementProject.entity.Book;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
