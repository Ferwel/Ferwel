/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }
    
    /**
     * Comprueba si el nombre es vac?o, si es as? lo establece como noNamed, si no lo establece como el nombre
     * @param nombre nombre de lista
     */

    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    /**
     * 
     * @return Numero de productos
     */
    
    public int totalProductos(){
            return this.getNumProductos();
    }
     
    /**
     * Registra un producto en la lista
     * @param prod productos
     * @return prod
     */
    public Producto registraProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }

    /**
     * Elimina un producto de la lista
     * @param codigo codigo del producto
     * @return prod
     */
    public Producto descartaProducto(String codigo) { 
        
        Producto prod = encuentraProducto(codigo);
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }
    
    /**
     * 
     * @param codigo codigo del producto
     * @return listaP lista de los productos
     */
    public Producto encuentraProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
