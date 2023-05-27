/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author E d i n s s o n
 */
public class Conectar{
    
    Connection conectar = null;
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", "root", "");
            System.out.println("conexion aceptada...");
        
        }catch (Exception e){
        System.out.print("mensaje de error"+e);
        JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
    
        return conectar;
    }
}
