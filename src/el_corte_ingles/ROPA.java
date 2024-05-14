/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_corte_ingles;

/**
 *
 * @author Usuario
 */
public class ROPA {

    
      //Creamos la clase ROPA, perteneciente a nuestra tienda, con sus correspondientes atributos y métodos

    
    public String nombre;

   
    public String tipo;
    private float precio;

    public String color;
    
    
    public ROPA(){
        
    }
    /**
     * 
     * @param nombre: descripcion/nombre del producto
     * @param tipo: camiseta, pantalón etc
     * @param precio: valor en euros
     * @param color: diseño
     */
    
    public ROPA(String nombre,String tipo,float precio,String color){
        this.color = color;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
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
    public String getColor() {
        return color;
    }
    /**
     * 
     * @param color 
     */

    
    public void setColor(String color) {
        this.color = color;
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
