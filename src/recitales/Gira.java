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
public class Gira extends Recital{
    private String nombreGira;
    private FechaRecital [] listaFechas;
    private int fechas,dimL,actual;

    public Gira(String nombreBanda, int cantidadTemas, 
            String nombreGira, int cantidadFechas) {
        super(nombreBanda, cantidadTemas);
        this.nombreGira = nombreGira;
        this.fechas = cantidadFechas;
        this.dimL = 0;
        this.actual = 0;
        listaFechas = new FechaRecital[this.fechas];        
        
        for (int i = 0; i < this.fechas; ++i)
            listaFechas[i] = new FechaRecital();
    }

    
    
    
    
    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public int getFechas() {
        return fechas;
    }

    public void setFechas(int fechas) {
        this.fechas = fechas;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }

    
    


    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    public void agregarFecha(String nombreCiudad, int dia){
        if (dimL < fechas){
            FechaRecital aux = new FechaRecital();
            aux.setCiudad(nombreCiudad);
            aux.setDia(dia);
            listaFechas[dimL++] = aux;
        }
    }
    
    public void actuar(){
        if (!finalizado()){
            System.out.println("Buenas noches " + 
                    listaFechas[actual++].getCiudad());
            super.actuar();
            this.actuar();
        }
    }
    
    public boolean finalizado(){
        return this.getDimL() == this.getActual() ? true : false;
    }
    
    public int calcularCosto(){
        int aux = 0;
        for (int i = 0; i < dimL; ++i)
            aux += 3000;
        return aux;
    }
}
