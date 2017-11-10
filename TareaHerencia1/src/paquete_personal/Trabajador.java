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
public class Trabajador {

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

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

    public int getCostoHota() {
        return costo_por_hora;
    }

    //métodos: obtener_sueldo ((horas x costo_hora)+costo_seguro)
}
