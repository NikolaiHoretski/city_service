package com.nikolaihoretski.cityService.service;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.model.PhotoEntity;

import java.util.List;
import java.util.Optional;

public interface PhotoService {

    boolean hasAnyUsers();

    void saveAll(List<PhotoDto> cities);

    List<PhotoDto> getAllPhoto();
}
