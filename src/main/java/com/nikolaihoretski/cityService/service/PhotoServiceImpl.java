package com.nikolaihoretski.cityService.service;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.mapper.PhotoMapper;
import com.nikolaihoretski.cityService.model.PhotoEntity;
import com.nikolaihoretski.cityService.repo.PhotoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    Logger logger = LoggerFactory.getLogger(PhotoServiceImpl.class);


    @Override
    public boolean hasAnyUsers() {
        logger.info("в базе есть записи - true, в базе нет записей - false! Результат : {}", photoRepository.existsByIdIsNotNull());
        return photoRepository.existsByIdIsNotNull();
    }

    @Override
    public void saveAll(List<PhotoDto> photos) {

        List<PhotoEntity> photoList = new ArrayList<>();
        for (PhotoDto dto : photos) {
            PhotoEntity entity = new PhotoEntity();
            entity.setPhoto_id(dto.getPhoto_id());
            entity.setName(dto.getName());
            entity.setPhoto(dto.getPhoto());
            photoList.add(entity);
        }

        photoRepository.saveAll(photoList);
    }

    @Override
    public List<PhotoDto> getAllPhoto() {

        List<PhotoEntity> photoList = photoRepository.findAll();

        List<PhotoDto> photoDtoList = new ArrayList<>();

        for (PhotoEntity entity : photoList) {
            photoDtoList.add(PhotoMapper.toDto(entity));
        }


        return photoDtoList;
    }
}
