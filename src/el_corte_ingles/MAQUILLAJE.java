/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_corte_ingles;

/**
 *
 * @author Usuario
 */
public class MAQUILLAJE {

    
      //Creamos la clase MAQUILLAJE, perteneciente a nuestra tienda, con sus correspondientes atributos y métodos

    
    public String nombre;
    public float precio;
    public String tono;
    private String tipo;
    public MAQUILLAJE(){
        
        
    }
    /**
     * 
     * @param nombre: nombre del producto
     * @param tipo: tipo, máscara de pestañas, pintauñas etc
     * @param precio: valor en euros
     * @param tono: tonalidad, color
     */
    public MAQUILLAJE(String nombre,String tipo,float precio,String tono){
        this.tono = tono;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }
        /**
         * 
         * @param nombre 
         */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
    public String getTono() {
        return tono;
    }
    /**
     * 
     * @param tono 
     */

    public void setTono(String tono) {
        this.tono = tono;
    }
    
    /**
     *
     * @return
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
    
}
