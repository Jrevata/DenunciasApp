package com.jrevata.denunciasapp.denunciasapp.models;

/**
 * Created by JORDAN on 14/05/2018.
 */

public class Reporte {

    private Integer id;
    private Denuncia denuncia;
    private Sereno sereno;
    private String detalle;

    public Reporte(){

    }

    public Reporte(Integer id, Denuncia denuncia, Sereno sereno, String detalle) {
        this.id = id;
        this.denuncia = denuncia;
        this.sereno = sereno;
        this.detalle = detalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public Sereno getSereno() {
        return sereno;
    }

    public void setSereno(Sereno sereno) {
        this.sereno = sereno;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }


    @Override
    public String toString() {
        return "Reporte{" +
                "id=" + id +
                ", denuncia=" + denuncia +
                ", sereno=" + sereno +
                ", detalle='" + detalle + '\'' +
                '}';
    }
}
