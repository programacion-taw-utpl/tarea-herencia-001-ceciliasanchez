/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

/**
 *
 * @author PC
 */
public class EmpresaPrivada {
    //hereda de Empresa

    private int ventas_mensual_fijo;
    private int numero_sucursales;
    
    public void setVentasMensualFijo(int ventas_m_f){
        ventas_mensual_fijo = ventas_m_f;
    }
    public int getVentasMensualFijo(){
        return ventas_mensual_fijo;
    }
     public void setNumeroVentas(int num_s){
        numero_sucursales=num_s;
    }
    public int getNumeroVentas(){
        return numero_sucursales;
    }
    
    

}
