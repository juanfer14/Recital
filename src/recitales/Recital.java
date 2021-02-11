/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recitales;

/**
 *
 * @author ayean
 */
public abstract class Recital {
    public String nombreBanda;
    public String[] listaTemas;
    public int dimL;
    public int cantTemas;
    public int temasTocados;

    public Recital(String nombreBanda, int cantTemas) {
        this.nombreBanda = nombreBanda;
        this.cantTemas = cantTemas;
	this.dimL = 0;
        this.temasTocados = 0;
        listaTemas = new String[cantTemas];
        for (int i=0; i<cantTemas; i++)
            listaTemas[i] = new String();
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }

    public int getTemasTocados() {
        return temasTocados;
    }

    public void setTemasTocados(int temasTocados) {
        this.temasTocados = temasTocados;
    }
    
    
    public void agregarTema (String tema){
        listaTemas[dimL++] = tema;
    }
    
    public String actuarRecital(){
        String aux = "";
        if (this.temasTocados < dimL){
            aux = "y ahora tocaremos " + listaTemas[temasTocados++] + "\n" + actuarRecital();
        } else
            this.temasTocados = 0;
        return "";
    }

    public abstract boolean finalizado();
    public abstract int calcularCosto();
}
