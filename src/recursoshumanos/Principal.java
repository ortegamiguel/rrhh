/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

/**
 *
 * @author Java Martes
 */
public class Principal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona("zxczx","fcsd",4536);
        
        p1.setNombre("p1");
        p1.setDomicilio("calle p1");
        p1.setEdad(1);
        
        p2.setNombre("p2");
        p2.setDomicilio("calle p2");
        p2.setEdad(2);
        
        
        
        System.out.println("P1 -->" + p1.getNombre() + " " + p1.getDomicilio() + " " + p1.getEdad());
        System.out.println("P2 -->" + p2.getNombre() + " " + p2.getDomicilio() + " " + p2.getEdad());
        System.out.println("P3 -->" + p3.getNombre() + " " + p3.getDomicilio() + " " + p3.getEdad());
        

    }
}