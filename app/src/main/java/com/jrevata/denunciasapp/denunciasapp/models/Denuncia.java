package com.jrevata.denunciasapp.denunciasapp.models;

/**
 * Created by Alumno on 11/05/2018.
 */

public class Denuncia {

    private Integer id;
    private Integer user_id;
    private String title;
    private String description;
    private String coordenadas;
    private String photo;
    private String coordinates;


    public Denuncia(){}


    public Denuncia(Integer id, Integer user_id, String title, String description, String coordenadas, String photo, String coordinates) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.description = description;
        this.coordenadas = coordenadas;
        this.photo = photo;
        this.coordinates = coordinates;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Denuncia{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                ", photo='" + photo + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}
