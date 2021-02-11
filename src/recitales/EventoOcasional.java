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
public class EventoOcasional extends Recital {
    private int motivo;
    private String contratante;
    private int diaEvento;

    public EventoOcasional (String nombreBanda, int cantTemas, int motivo, String contratante, int diaEvento){
        super(nombreBanda, cantTemas);
        this.motivo = motivo;
        this.contratante = contratante;
        this.diaEvento = diaEvento;
    }

    public int getMotivo() {
        return motivo;
    }

    public void setMotivo(int motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public int getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(int diaEvento) {
        this.diaEvento = diaEvento;
    }
    
    
    public String actuar (){
        String aux = "";
        switch (motivo) {
            case 1: aux = "Recuerde colaborar con " + this.getContratante() + "\n";
            case 2: aux = "Saludos amigos televidentes\n";
            case 3: aux = "Un feliz cumpleaños para " + this.getContratante() + "\n";
        }
        return aux + this.actuarRecital();
    }
    
    public boolean finalizado (){
        return (this.getTemasTocados() == this.getCantTemas());
    }
    
     public int calcularCosto (){
        int aux = 0;
        switch (motivo) {
              case 1: return aux = 0;
              case 2: return aux = 5000;
              case 3: return aux = 150000;
        }
        return aux;
    }
}
