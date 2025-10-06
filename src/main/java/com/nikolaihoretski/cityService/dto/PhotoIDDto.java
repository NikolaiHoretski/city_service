package com.nikolaihoretski.cityService.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PhotoIDDto {

    private long id;
    private String name;
    private String photo;

    public PhotoIDDto(long id, String name, String photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }

    public PhotoIDDto() {
    }

}
