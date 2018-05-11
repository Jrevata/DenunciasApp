package com.jrevata.denunciasapp.denunciasapp.models;

/**
 * Created by Alumno on 11/05/2018.
 */

public class Sereno extends Persona {

    private Integer estado;


    public Sereno(Integer id, String user, String password, String name, String lastname, Integer estado) {
        super(id, user, password, name, lastname);
        this.estado = estado;
    }

}
