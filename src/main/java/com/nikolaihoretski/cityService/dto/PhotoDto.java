package com.nikolaihoretski.cityService.dto;

public class PhotoDto {

    private long photo_id;
    private String name;
    private String photo;

    public PhotoDto() {
    }

    public PhotoDto(long photo_id, String name, String photo) {
        this.photo_id = photo_id;
        this.name = name;
        this.photo = photo;
    }

    public long getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(long photo_id) {
        this.photo_id = photo_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
