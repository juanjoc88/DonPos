/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donpos;
import java.sql.*;
/**
 *
 * @author notebook cps
 */
public class Conexion {
//Parametros para la conexion con al base de datos apuntda
    String URL = "jdbc:postgresql://localhost:5432/Donantes";
    String usuario = "postgres";
    String contraseña = "root";
    Connection conexion = null;
    
//Este metodo se conecta    
    public Conexion(){
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
        }
        catch (ClassNotFoundException | SQLException e){
           // System.out.print("Error de conexion" + e.getMessage());
        }
    }
//Este metodo devuelve la conexion a las clases que lo necesiten.    
    public Connection getConexion() {
        return conexion;
    }
//Este metodo desconecta.    
    public void desconectar(){
        conexion = null;
    }
    
}
