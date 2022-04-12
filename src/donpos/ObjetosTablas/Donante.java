/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donpos.ObjetosTablas;

/**
 *
 * @author notebook cps
 */
public class Donante {
    
    
    private int nDoc;
    private String apeNom;
    private String telefono;
    private String localidad;
    private boolean tarjeta;
    private String grupoSang;
    private String resultado;

    public Donante(){}
    
    public void setnDoc(int nDoc) {
        this.nDoc = nDoc;
    }

    public void setApeNom(String apeNom) {
        this.apeNom = apeNom.toUpperCase();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono.toUpperCase();
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad.toUpperCase();
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setGrupoSang(String grupoSang) {
        this.grupoSang = grupoSang.toUpperCase();
    }

    public int getnDoc() {
        return nDoc;
    }

    public String getApeNom() {
        return apeNom;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLocalidad() {
        return localidad;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public String getGrupoSang() {
        return grupoSang;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
        
}
