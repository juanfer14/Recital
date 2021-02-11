/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recitales;

import PaqueteLectura.Lector;

/**
 *
 * @author juanf
 */
public class PruebaRecital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        String nombreContratante;
        int motivo;
        String nombreBanda;
        String auxTema;
        String [] temas = new String[20];
        int cantidadTemas;
        
        String nombreGira;
        String nombreCiudad;
        int diaCiudad;
        
        EventoOcasional recitalongoOcasional;
        
        System.out.print("Introduzca el dia del evento: ");
        dia = Lector.leerInt(); 
        System.out.print("Introduzca el nombre del contratante: ");
        nombreContratante = Lector.leerString();
        System.out.print("Introduca el motivo, 1. A beneficio, 2. Show de TV, 3. Show Privado: ");
        motivo = Lector.leerInt();
        System.out.print("Introduzca el nombre de la banda: ");
        nombreBanda = Lector.leerString();
        
        recitalongoOcasional = new EventoOcasional(nombreBanda, 20, motivo, nombreContratante);
        
        cantidadTemas = 0;
        System.out.print("Introduzca el nombre del tema ('zzz' para terminar): ");
        auxTema = Lector.leerString();
        while (!auxTema.equals("zzz") && cantidadTemas < 20){
            recitalongoOcasional.agregarTema(auxTema);
            System.out.print("Introduzca el nombre del tema ('zzz' para terminar): ");
            auxTema = Lector.leerString();
            ++cantidadTemas;
        }
        
        int costoEvento = recitalongoOcasional.calcularCosto();
        System.out.println("El costo del evento es de: "+costoEvento);
        recitalongoOcasional.actuar();
        
        System.out.println("Introduzca el nombre de la gira: ");
        nombreGira = Lector.leerString();
        System.out.print("Introduzca el nombre de la banda: ");
        nombreBanda = Lector.leerString();
        Gira recitalongoGira = new Gira(nombreBanda, 20, nombreGira, 10);
        
        cantidadTemas = 0;
        System.out.print("Introduzca el nombre del tema ('zzz' para terminar): ");
        auxTema = Lector.leerString();
        while (!auxTema.equals("zzz") && cantidadTemas < 20){
            recitalongoGira.agregarTema(auxTema);
            System.out.print("Introduzca el nombre del tema ('zzz' para terminar): ");
            auxTema = Lector.leerString();
            ++cantidadTemas;
        }
        
        int cantCiudades = 0;
        System.out.print("Introduzca el nombre de la ciudad ('zzz' para terminar): ");
        nombreCiudad = Lector.leerString();
        while (!nombreCiudad.equals("zzz") && cantCiudades < 10){
            System.out.print("Introduzca el dia en que se produce el recital: ");
            diaCiudad = Lector.leerInt();
            recitalongoGira.agregarFecha(nombreCiudad, diaCiudad);
            ++cantCiudades;
            System.out.print("Introduzca el nombre de la ciudad ('zzz' para terminar): ");
            nombreCiudad = Lector.leerString();
        }
        
        
        int costoTotal = recitalongoGira.calcularCosto();
        System.out.println("El costo de la gira es de: " + costoTotal);
        recitalongoGira.actuar();
        

    }
    
}
