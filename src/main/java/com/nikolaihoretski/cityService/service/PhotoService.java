package com.nikolaihoretski.cityService.service;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.dto.PhotoIDDto;
import com.nikolaihoretski.cityService.model.PhotoEntity;

import java.util.List;

public interface PhotoService {

    boolean hasAnyUsers();

    void saveAll(List<PhotoDto> cities);

    List<PhotoDto> getAllPhoto();

    List<PhotoDto> findAllByName(String name);

    List<PhotoIDDto> findById(long id);

    void save(PhotoDto photos);
}
