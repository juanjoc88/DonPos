/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donpos;

import donpos.ObjetosTablas.Donante;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author notebook cps
 */
public class ABMDonantes {
    
    String cadenaAltas = "INSERT INTO public.\"Donante\" VALUES ";
    String cadenaListar = "SELECT * FROM public.\"Donante\"";
    PreparedStatement sentencia =  null;
    Statement sentencia2 = null;
    
    public void registrarDonantes(Donante don){
        //Objetos de la clase conexion.
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + don.getnDoc() + "','" + don.getApeNom() + "','" + don.getTelefono() + "','"
                                      + don.getLocalidad() + "','" + don.isTarjeta() + "','" + don.getGrupoSang() + "');";
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
    
    public ResultSet listarDonantes(){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        ResultSet rs = null;
        try{
            sentencia =  conne.prepareStatement(cadenaListar);
            rs = sentencia.executeQuery();
            
        }
        catch(SQLException e){
            
        }
        return rs;

    }
    
    
    /* public static String ActualizarDonantes(Donante don){
        String result = null;
        String last = null;
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        PreparedStatement sentencia =  null;
        String comando = "UPDATE Donante SET (null, ?, ?, ?,?,?) WHERE nDoc";
        try{
            sentencia = conne.prepareStatement(comando);
            sentencia.setInt(1, don.getnDoc());
            sentencia.setString(2, don.getApeNom());
            sentencia.setString(3, don.getTelefono());
            sentencia.setString(4, don.getLocalidad());
            sentencia.setBoolean(5, don.isTarjeta());
            sentencia.setString(6, don.getGrupoSang());
            sentencia.execute();
            ResultSet rs = sentencia.executeQuery();
            if(rs.next()){
                last = rs.getString(1);
            }
            result = "Donante registrado con exito" + last;            
        }
        catch(SQLException e){
            result = "No se pudo registrar";
        }
        finally{
            try{
                if(conne != null){
                    conne.close();
                    sentencia.close();
                }
            }
            catch(SQLException e){
                result = "Error" + e;
            }
        }
        return null;
    }*/
    
}
