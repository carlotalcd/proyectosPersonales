/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_corte_ingles;

/**
 *
 * @author Usuario
 */
public class ALIMENTACION {

    //Creamos la clase CALZADO, perteneciente a nuestra tienda, con sus correspondientes atributos y métodos
    public String tipo;
    public float precio;
    public String marca;
    
    public ALIMENTACION(){
        
    }
    /**
     * 
     * @param tipo: tipo de comida
     * @param precio: precio del producto
     * @param marca: marca del producto
     */
    
    public ALIMENTACION(String tipo,float precio,String marca){
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }
    /**
     * 
     * @return tipo
     */
        public String getTipo() {
        return tipo;
        
    }
        /**
         * 
         * @param tipo 
         */


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public float getPrecio() {
        return precio;
    }
    
    /**
     * 
     * @param precio 
     */


    public void setPrecio(float precio) {
        this.precio = precio;
    }

 
    public String getMarca() {
        return marca;
    }
    
    /**
     * 
     * @param marca 
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
