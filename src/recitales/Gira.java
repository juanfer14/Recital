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
public class Gira extends Recital{
    private String nombreGira;
    private int cantFechas;
    private FechaRecital[] fechas;
    private int dimF;
    private int actual;

    public Gira(String nombreBanda, int cantTemas, String nombreGira,int cantFechas) {
        super(nombreBanda, cantTemas);
        this.nombreGira = nombreGira;
        this.cantFechas = cantFechas;
        this.dimF = 0;
	this.actual = 0;
        fechas = new FechaRecital[cantFechas];
        for (int i=0; i<cantFechas; i++)
            fechas[i] = null;
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public int getCantFechas() {
        return cantFechas;
    }
    
    public void agregarFecha (String ciudad, int dia){
        FechaRecital F = new FechaRecital(ciudad,dia);
        fechas[dimF++] = F;
    }
    
    public String actuar (){
        return !finalizado() ?  "Buenas noches " + 
                fechas[actual++].getCiudad() + "\n" + 
                this.actuarRecital() + actuar() : "";
    }
    
    public boolean finalizado (){
        return (this.actual == this.dimF);
    }
    
    public int calcularCosto (){
        return (this.getCantFechas() * 30000);
    }
    
}
