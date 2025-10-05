package com.nikolaihoretski.cityService.model;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class PhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "photo_id")
    private long photo_id;
    @Column(name = "name", length = 1000)
    private String name;
    @Column(name = "photo", length = 1000)
    private String photo;

    public PhotoEntity(long photo_id, String name, String photo) {
        this.photo_id = photo_id;
        this.name = name;
        this.photo = photo;
    }

    public PhotoEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(long photo_id) {
        this.photo_id = photo_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "PhotoEntity{" +
                "id=" + id +
                ", photo_id=" + photo_id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
