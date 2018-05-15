package com.jrevata.denunciasapp.denunciasapp.models;

/**
 * Created by Alumno on 11/05/2018.
 */

public class Denuncia {

    private Integer id;
    private Integer ciudadanos_id;
    private String titulo;
    private String descripcion;
    private String foto;
    private String coordenadas;


    public Denuncia(){}

    public Denuncia(Integer id, Integer ciudadanos_id, String titulo, String descripcion, String foto, String coordenadas) {
        this.id = id;
        this.ciudadanos_id = ciudadanos_id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
        this.coordenadas = coordenadas;
    }

    @Override
    public String toString() {
        return "Denuncia{" +
                "id=" + id +
                ", ciudadanos_id=" + ciudadanos_id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", foto='" + foto + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCiudadanos_id() {
        return ciudadanos_id;
    }

    public void setCiudadanos_id(Integer ciudadanos_id) {
        this.ciudadanos_id = ciudadanos_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
