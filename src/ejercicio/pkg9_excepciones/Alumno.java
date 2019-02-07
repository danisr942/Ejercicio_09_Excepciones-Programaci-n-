/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9_excepciones;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Alumno {
    static int num_asignaturas;
    private String nombre;
    ArrayList<Double> array = new ArrayList<>();

    /**
     * Este contructor por defecto solo pone los valores por defecto
     */
    public Alumno() {
        num_asignaturas=5;
        nombre="";
        array= new ArrayList<>(5);  
    }

    /**
     * 
     * @param nombre recibe unicamente el nomnre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return devuelve el get y set del nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
}
