
package el_corte_ingles;

/**
 *
 * @author Usuario
 */
public class INFORMATICA {

      //Creamos la clase INFORMÁTICA, perteneciente a nuestra tienda, con sus correspondientes atributos y métodos

    public String nombre;

    public float precio;

    public String marca;

    public String dispositivo;
    
    public INFORMATICA(){
        
    }
    /**
     * 
     * @param nombre: nombre del producto
     * @param marca: marca del producto
     * @param precio: valor en euros
     * @param dispositivo: ordenador, teléfono etc.
     */
    
    public INFORMATICA(String nombre,String marca,float precio,String dispositivo){
        this.marca = marca;
        this.nombre = nombre;
        this.dispositivo = dispositivo;
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

    /**
     *
     * @return
     */
    public String getDispositivo() {
        return dispositivo;
    }
    /**
     * 
     * @param dispositivo 
     */

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
}
