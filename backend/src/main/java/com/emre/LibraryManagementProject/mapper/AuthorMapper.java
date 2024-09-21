package com.emre.LibraryManagementProject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.emre.LibraryManagementProject.dto.request.AuthorRequest;
import com.emre.LibraryManagementProject.dto.response.AuthorResponse;
import com.emre.LibraryManagementProject.entity.Author;

import java.util.List;

@Mapper
public interface AuthorMapper {
    Author asEntity(AuthorRequest authorRequest);

    AuthorResponse asOutput(Author author);

    List<AuthorResponse> asOutput(List<Author> author);

    void update(@MappingTarget Author entity, AuthorRequest request);
}
