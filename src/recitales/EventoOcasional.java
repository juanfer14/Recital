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
public class EventoOcasional extends Recital{
    private int motivo, dia;
    private String contratante;

    public EventoOcasional(String nombreBanda, int cantidadTemas, 
            int motivo, String contratante) {
        super(nombreBanda, cantidadTemas);
        this.motivo = motivo;
        this.contratante = contratante;
    }

    
    
    public int getMotivo() {
        return motivo;
    }

    public void setMotivo(int motivo) {
        this.motivo = motivo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }
    
    public void actuar(){
        switch (motivo) {
            case 1: System.out.println("Recuerde colaborar con " + this.getContratante() );
            case 2: System.out.println("Saludos amigos televidentes");
            case 3: System.out.println("Un feliz cumpleaños para " + this.getContratante());
        }
        super.actuar();
    }
    
    public boolean finalizado(){
        return this.getTemas() == this.getActual() ? true : false;
    }
    
    public int calcularCosto(){
          int aux = 0;
          switch (motivo) {
              case 1: return aux = 0;
              case 2: return aux = 5000;
              case 3: return aux = 150000;
          }
          
          return aux;
    }
    
    
}
