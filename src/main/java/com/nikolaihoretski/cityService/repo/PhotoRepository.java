package com.nikolaihoretski.cityService.repo;

import com.nikolaihoretski.cityService.model.PhotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<PhotoEntity, Long> {

    boolean existsByIdIsNotNull();
}
