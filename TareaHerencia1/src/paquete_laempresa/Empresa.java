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
    private String siglas;
    private String ciudad;
    private Trabajador[] trabajadores;

    public Empresa(String nombre_emp, String sig, String cd, Trabajador[] t) {
        nombre = nombre_emp;
        siglas = sig;
        ciudad = cd;
        trabajadores = t;

    }

    public void setNombre(String nombre_emp) {
        nombre = nombre_emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSiglas(String sig) {
        siglas = sig;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setCiudad(String cd) {
        ciudad = cd;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setTrabajadores(Trabajador[] t) {
        trabajadores = t;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public String trabajadores() {
        String trab = " ";

        for (int i = 0; i < trabajadores.length; i++) {
            trab += trabajadores[i];
        }
        return trab;
    }

   

    @Override

    public String toString() {
        String cadena = String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s\n", getNombre(), getSiglas(), getCiudad());
        return cadena;

    }

}
