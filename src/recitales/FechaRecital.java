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
public class FechaRecital {
    private String ciudad;
    private int dia;

    public FechaRecital(String ciudad, int dia) {
        this.ciudad = ciudad;
        this.dia = dia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    
}
