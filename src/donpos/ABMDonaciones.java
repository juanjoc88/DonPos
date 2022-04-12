/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donpos;

import donpos.ObjetosTablas.Donacion;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ABMDonaciones {
    String cadenaAltas = "INSERT INTO public.\"Donacion\" VALUES ";
    String cadenaListar = "SELECT * FROM public.\"Donacion\"";
    PreparedStatement sentencia =  null;
    Statement sentencia2 = null;
    
    public void registrarDonacion(Donacion donac){
        //Objetos de la clase conexion.
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + donac.getNumDon()+ "','" + donac.getNumDoc()+ "','" + donac.getFechaDon() + "','" + donac.getSero() + "','" + donac.getDif() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            ResultSet rs = sentencia.executeQuery();               
        }
        catch(SQLException e){
            }
        finally{
            try{
                if(conne != null){
                    conne.close();
                    sentencia.close();
                }
            }
            catch(SQLException e){
            }
        }
    }
}
