package com.jrevata.denunciasapp.denunciasapp.models;

/**
 * Created by Alumno on 11/05/2018.
 */

public class Ciudadano extends Persona {

    private String correo;

    public Ciudadano(Integer id, String user, String password, String name, String lastname, String correo) {
        super(id, user, password, name, lastname);
        this.correo = correo;
    }
}
