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
public class Trabajador extends Persona {

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

    public Trabajador(String n, String a, int e, String c, int costo_s, int horas_t, int costo_h, int sueldo) {
        super(n, a, e, c);
        horas_trabajadas = horas_t;
        costo_seguro = costo_s;
        costo_por_hora = costo_h;

    }

    public Trabajador() {

    }

    public void setCostoSeguro(int costo_s) {
        costo_seguro = costo_s;
    }

    public int getCostoSeguro() {
        return costo_seguro;
    }

    public void setHorasTrabajadas(int horas_t) {
        horas_trabajadas = horas_t;
    }

    public int getHorasTrabajadas() {
        return horas_trabajadas;
    }

    public void setCostoHora(int costo_h) {
        costo_por_hora = costo_h;
    }

    public int getCostoHora() {
        return costo_por_hora;
    }

    //obtener_sueldo ((horas x costo_hora)+costo_seguro)
    public int obtener_sueldo() {

        int sueldo = 0;
        sueldo = (horas_trabajadas * costo_por_hora) + costo_seguro;

        return sueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s \n"
                + "\t\tSeguro: $%s\n"
                + "\t\tHoras Trabajadas: %s\n"
                + "\t\tValor por Hora: $%s\n"
                + "\t\tSueldo: $%s\n", super.toString(), getCostoSeguro(), getHorasTrabajadas(), getCostoHora(), obtener_sueldo());
        return cadena;

    }

}
