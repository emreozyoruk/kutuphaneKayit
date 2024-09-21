package com.emre.LibraryManagementProject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.emre.LibraryManagementProject.dto.request.BookBorrowingRequest;
import com.emre.LibraryManagementProject.dto.request.BookBorrowingUpdateRequest;
import com.emre.LibraryManagementProject.entity.BookBorrowing;

@Mapper
public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
