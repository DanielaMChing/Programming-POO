/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author mdani
 */

public class Usuario {
    private String nombre;
    private String cedula;
    private String correo;

    public Usuario(String nombre, String cedula, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }
}
