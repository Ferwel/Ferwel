/*
*	grupo  : 1ºGDAM
*	alumno : Fernando Renshaw Calderón
*	n.exp. : 7259
*	fecha  : 09/06/2022  
 */
package Cheese;

import java.util.ArrayList;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * MÃ©todo main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1Âº Gdam: Entornos de desarrollo");
         Producto manzana = new Producto("1","fruta", 5, 10);
         Producto platano = new Producto("2","fruta", 5, 20);
         ArrayList<Producto> prodsLists = new ArrayList<>();
         prodsLists.add(manzana);
         prodsLists.add(platano);
         manzana.imprime_etiqueta();
         platano.imprime_etiqueta();

     }
}
