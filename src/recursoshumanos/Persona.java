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
public class Persona {

    private String nombre;
    private String domicilio;
    private int edad;
    
    public Persona(){}
    
    public Persona(String nombre, String domicilio,int edad ){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static void imprimeDatos(){
        System.out.println("Los datos de la persona\n");
    }
    
    public static void imprimeDatos(String titulo){
    
    }
}
