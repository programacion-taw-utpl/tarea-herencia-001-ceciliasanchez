/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

import paquete_personal.Trabajador;

/**
 *
 * @author PC
 */
public class Empresa {

    private String nombre;
    private char siglas;
    private String ciudad;
    private Trabajador[] trabajadores;

    public void setNombre(String nombre_emp) {
        nombre = nombre_emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSiglas(char sig) {
        siglas = sig;
    }

    public char getSiglas() {
        return siglas;
    }

    public void setCiudad(String cd) {
        ciudad = cd;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setTrabajador(Trabajador[]trab) {
        trabajadores = trab;
    }

    public Trabajador[] getTrabajador() {
        return trabajadores;
    }

}
