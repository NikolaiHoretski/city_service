package com.nikolaihoretski.cityService.controller;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.dto.PhotoIDDto;
import com.nikolaihoretski.cityService.model.PhotoEntity;
import com.nikolaihoretski.cityService.service.PhotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class PhotoController {

    @Autowired
    private PhotoServiceImpl photoService;

    @GetMapping("/ispresent")
    public boolean isPresent() {
        return photoService.hasAnyUsers();
    }

    @GetMapping("/getallphoto")
    public List<PhotoDto> getAll() {
        return photoService.getAllPhoto();
    }

    @GetMapping("/findall/{name}")
    public List<PhotoDto> getPhotosByName(@PathVariable String name) {
        return photoService.findAllByName(name);
    }

    @GetMapping("/find/{id}")
    public List<PhotoIDDto> getPhotoById(@PathVariable long id) {
        return photoService.findById(id);
    }

    @PostMapping("/savephoto")
    public void savePhoto(@RequestBody PhotoDto photoDto) {
        photoService.save(photoDto);
    }
}
