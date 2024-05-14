/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_corte_ingles;

/**
 *
 * @author carlo
 */
public class Usuario {
    
    String nombre;
    String password;
    /**
     * 
     * @param nombre
     * @param password 
     */

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
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

    public String getPassword() {
        return password;
    }
    /**
     * 
     * @param password 
     */

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
