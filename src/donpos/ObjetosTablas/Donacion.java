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
public class Donacion {
    
    private int numDon;
    private int numDoc;
    private String fechaDon;
    private String sero;
    private String dif;
    private String resultado;
    
    public Donacion(){}

    public int getNumDon() {
        return numDon;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public String getFechaDon() {
        return fechaDon;
    }

    public String getSero() {
        return sero;
    }

    public String getDif() {
        return dif;
    }

    public void setNumDon(int numDon) {
        this.numDon = numDon;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public void setFechaDon(String fechaDon) {
        this.fechaDon = fechaDon;
    }

    public void setSero(String sero) {
        this.sero = sero.toUpperCase();
    }

    public void setDif(String dif) {
        this.dif = dif.toUpperCase();
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
       
}
