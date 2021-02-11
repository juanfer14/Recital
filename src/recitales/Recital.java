/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recitales;

/**
 *
 * @author juanf
 */
public abstract class Recital {

    private String nombreBanda;
    private String [] listaTemas;
    private int temas;
    private int actual;

    public Recital(String nombreBanda, int cantidadTemas) {
        this.nombreBanda = nombreBanda;
        this.temas = cantidadTemas;
        this.actual = 0;
        listaTemas = new String[this.temas];
        for (int i = 0; i < this.temas; ++i)
            listaTemas[i] = new String();
    }
    
    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getTemas() {
        return temas;
    }

    public void setTemas(int temas) {
        this.temas = temas;
    }
    
    public void agregarTema(String nombreTema){
        if (actual < temas){
            listaTemas[actual++] = nombreTema;
        }
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    
    
    public void actuar(){
        for (int i = 0; i < actual; ++i)
            System.out.println("Y ahora tocaremos " + listaTemas[i]);
    }
    
    public abstract boolean finalizado();
    public abstract int calcularCosto();
}
