/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import paquete_laempresa.EmpresaPrivada;
import paquete_personal.Trabajador;

/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Trabajador t = new Trabajador();

        Trabajador trab[] = new Trabajador[2];

        trab[0] = new Trabajador("Ana Luisa", "Velez Alcivar", 30, "12903939", 100, 40, 10, t.obtener_sueldo());

        trab[1] = new Trabajador("Mario Anibal", "Vela Narvaez", 35, "12903939", 100, 50, 10, t.obtener_sueldo());

        EmpresaPrivada ep = new EmpresaPrivada("Soluciones Software", "SS's", "Loja", trab, 200000, 12);

        System.out.println(ep);

    }

}
