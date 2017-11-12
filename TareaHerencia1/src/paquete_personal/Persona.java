/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author PC
 */
public class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    private String cedula;

    public Persona() {

    }

    public Persona(String n, String a, int e, String c) {
        nombres=n;
        apellidos =a;
        edad = e;
        cedula = c;

    }

    public void setNombres(String nomPersona) {
        nombres = nomPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setApellidos(String apePersona) {
        apellidos = apePersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(String c) {
        cedula = c;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\t\t%s %s\n"
                + "\t\t%s años de edad\n"
                + "\t\tCI: %s", getNombres(), getApellidos(), getEdad(), getCedula());
        return cadena;
    }

}
