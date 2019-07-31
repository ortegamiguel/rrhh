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
public abstract class Persona implements Comparable{

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
    
    public abstract void imprimeDatos();
    
    public static void imprimeDatos(String titulo){
    
    }
    
    @Override
    public int compareTo(Object t) {
        Persona emp = (Persona) t;
        if (this.getEdad() == emp.getEdad()) {
            return 0;
        } else if (this.getEdad() > emp.getEdad()) {
            return 1;
        }else {
            return -1;
        }
    }
}
