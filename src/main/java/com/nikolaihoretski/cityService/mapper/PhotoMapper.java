package com.nikolaihoretski.cityService.mapper;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.dto.PhotoIDDto;
import com.nikolaihoretski.cityService.model.PhotoEntity;

public class PhotoMapper {

    public static PhotoDto toDto(PhotoEntity photo) {
        PhotoDto dto = new PhotoDto();
        dto.setPhoto_id(photo.getPhoto_id());
        dto.setName(photo.getName());
        dto.setPhoto(photo.getPhoto());

        return dto;
    }

    public static PhotoEntity toEntity(PhotoDto dto) {
        PhotoEntity entity = new PhotoEntity();
        entity.setPhoto_id(dto.getPhoto_id());
        entity.setName(dto.getName());
        entity.setPhoto(dto.getPhoto());

        return entity;
    }

    public static PhotoIDDto toIDDto(PhotoEntity photo) {
        PhotoIDDto dto = new PhotoIDDto();
        dto.setId(photo.getId());
        dto.setName(photo.getName());
        dto.setPhoto(photo.getPhoto());
        return dto;
    }
}
