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
public class Empleado extends Persona{
    private int numEmp;
    private String puesto;
    private double sueldo;

    public Empleado(String nombre) {
        super(nombre);
    }

    public Empleado(String puesto, double sueldo, String nombre, String domicilio, int edad) {
        super(nombre, domicilio, edad);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numEmp=" + numEmp + ", puesto=" + puesto + ", sueldo=" + sueldo + '}';
    }

    @Override
    public void imprimeDatos() {
        System.out.println("datos" + getNombre()); 
    }
    
    public void aumentarSueldo(double aumento) throws AumentaSueldoException{ 
        if (aumento > 0) {
            this.setSueldo(aumento);
        } else {
            throw new AumentaSueldoException("Ha ocurrido una excepción");
        }
    }
}
