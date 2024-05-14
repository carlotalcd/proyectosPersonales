
package el_corte_ingles;

/**
 *
 * @author Usuario
 */
public class CALZADO {
    
    //Creamos la clase CALZADO, perteneciente a nuestra tienda, con sus correspondientes atributos y métodos

    public String nombre;
    public float precio;
    public String color;
    private String tipo;
    
    public CALZADO(){
        
    }
    
    /**
     * 
     * @param nombre: nombre del modelo
     * @param tipo: tipo de zapatilla, deporte, vestir etc
     * @param precio: valor en euros
     * @param color: color de la zapatilla
     */
    
    public CALZADO(String nombre,String tipo,float precio,String color){
        this.color = color;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
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
    
}
