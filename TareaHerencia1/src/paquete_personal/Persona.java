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
    private char cedula;
    
    public void setNombres(String nomPersona){
        nombres = nomPersona;
    }
    public String getNombres(){
        return nombres;
    }
    
    public void setApellidos(String apePersona){
        apellidos= apePersona;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setEdad(int e){
        edad = e;
    }
    public int getEdad(){
        return edad;
    }
    public void setCedula(char c){
        cedula=c;
    }
    public char getCedula(){
        return cedula;
    }
}
