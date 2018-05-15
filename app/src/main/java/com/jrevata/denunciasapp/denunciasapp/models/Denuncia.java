package com.jrevata.denunciasapp.denunciasapp.models;

/**
 * Created by Alumno on 11/05/2018.
 */

public class Denuncia {

    private Integer id;
    private Ciudadano ciudadado;
    private String title;
    private String description;
    private String photo;
    private String coordinates;


    public Denuncia(){}

    public Denuncia(Integer id, Ciudadano ciudadado, String title, String description, String photo, String coordinates) {
        this.id = id;
        this.ciudadado = ciudadado;
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.coordinates = coordinates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ciudadano getCiudadado() {
        return ciudadado;
    }

    public void setCiudadado(Ciudadano ciudadado) {
        this.ciudadado = ciudadado;
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
                ", ciudadado=" + ciudadado +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}
