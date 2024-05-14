/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_corte_ingles;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionSql {
    
    Connection conectar = null;
    
    String usuario = "SuperUsuarioSql";
    String contraseña = "1234";
    String BBDD = "El Corte Inglés";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+ puerto + ";"+"DataBaseName=" +BBDD;
    
    //public Connection EstablecerConexion(){
        
        //try{
            //String cadena = "jdbc:sqlserver://"+ip+":"+ puerto + "/" +BBDD;
            //conectar = DriverManager.getConnection(cadena,usuario,contraseña);
           // JOptionPane.showMessageDialog(null, "Se conecto correctamente la Base de Datos");
            
       // }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos, error :" + e.toString());
        //}
        //return conectar;
    //}
}
