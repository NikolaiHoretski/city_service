package com.nikolaihoretski.cityService.controller;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.service.PhotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/getAllPhoto")
    public List<PhotoDto> getAll() {
        return photoService.getAllPhoto();
    }
}
