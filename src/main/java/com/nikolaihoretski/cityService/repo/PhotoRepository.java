package com.nikolaihoretski.cityService.repo;

import com.nikolaihoretski.cityService.model.PhotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<PhotoEntity, Long> {

    boolean existsByIdIsNotNull();

    List<PhotoEntity> findByName(String name);

    List<PhotoEntity> findById(long id);
}
