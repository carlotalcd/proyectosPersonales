/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el_corte_ingles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionmMySQL {
    
    //Declaramos la conexion a mysql
    public static Connection con;
    
    //Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/El_Corte_Ingles";
    
    //Método que va a conectar a la base de datos 
    public Connection ConexionmMySQL(){
        con=null;
        //Establecemos la conexion con nuestra base de datos, incluyendo ruta, nombre de la BBDD, usuario y contraseña
        try{
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
            
        }
          
        } catch(SQLException e){
            //Incluimos excepción para que en caso de error nos lo imprima 
            JOptionPane.showMessageDialog(null,"Error "+ e.toString());
        }
        return con;
    }
    
        
        
    }

