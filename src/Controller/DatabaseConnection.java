package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jbarr
 */
public class DatabaseConnection {
    
    public static final String URL = "jdbc:mysql://localhost:3306/moviesdb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    Connection connection = null;
    
    public static Connection Main(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(SQLException e){
            System.out.println("Error de conexion " + e.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
            }
      return connection;  
    }

    public void cerrarConexion(){
        try{
            if(connection != null && !connection.isClosed() ){
                connection.close();
                JOptionPane.showMessageDialog(null, "Conexion Cerrada");
            }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "No se pudo cerrar la Conexion");
    }
    }
}
