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
public class EmpresaPrivada extends Empresa {

    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String nombre_emp, String sig, String cd,Trabajador [] t,int ventas_m_f, int num_s) {
        super(nombre_emp, sig, cd,t);
        ventas_mensual_fijo = ventas_m_f;
        numero_sucursales = num_s;

    }

    public void setVentasMensualFijo(int ventas_m_f) {
        ventas_mensual_fijo = ventas_m_f;
    }

    public int getVentasMensualFijo() {
        return ventas_mensual_fijo;
    }

    public void setNumeroS(int num_s) {
        numero_sucursales = num_s;
    }

    public int getNumeroS() {
        return numero_sucursales;
    }

    @Override
    public String toString() {
        String cadena = String.format( "%s"
                + "Ventas: $%s\n"
                + "Sucursales: %s\n"
                + "Lista de Trabajadores:\n"
                + "\t\t %s ", super.toString(), getVentasMensualFijo(), getNumeroS(),trabajadores());
        return cadena;
    }

}
