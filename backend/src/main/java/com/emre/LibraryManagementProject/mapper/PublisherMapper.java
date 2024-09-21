package com.emre.LibraryManagementProject.mapper;

import org.mapstruct.Mapper;

import com.emre.LibraryManagementProject.dto.response.PublisherResponse;
import com.emre.LibraryManagementProject.entity.Publisher;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
