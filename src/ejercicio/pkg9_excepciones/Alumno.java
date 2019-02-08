/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9_excepciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Alumno {

    public static int num_asignaturas;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>();

    /**
     * Este contructor por defecto solo pone los valores por defecto
     */
    public Alumno() {
        num_asignaturas = 5;
        nombre = "";
        notas = new ArrayList<>(5);
    }

    /**
     *
     * @param nombre recibe unicamente el nomnre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
        num_asignaturas = 5;
        notas = new ArrayList<>(5);
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

    /**
     * Este método recorre el numro de notas y las añade al array
     *
     * @throws RangoException
     */
    public void pedirNotas() throws RangoException {
        int nota = 1;
        for (int i = 0; i <num_asignaturas ; i++) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce la nota " + nota);
            double pedirnota = teclado.nextDouble();
            if (pedirnota >= 0 && pedirnota <= 10) {
                notas.add(pedirnota);
            } else {
                throw new RangoException("Error. Nota no válida");
            }

            nota++;
        }
    }

    /**
     * 
     * @param posicion se le pasa la posición de la nota
     * @param nnota se le pasa la nota del alumno
     * @throws RangoException lanza la excepcion si la nota no es válida
     * @throws MisteriosaException lanza la excepcion si la posicion es incorrecta
     */
    public void modificarNota(int posicion, double nnota) throws RangoException, MisteriosaException {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la posicion");
        posicion = teclado.nextInt();
        
        if(posicion>=0 && posicion<=5)
        {
             if (nnota >= 0 && nnota <= 10) {
                 notas.remove(posicion);
                 if(nnota==0)
                 {
                     notas.add(posicion,nnota);
                 }
                 notas.add(posicion-1,nnota);
                 
            } else {
                throw new RangoException("Error. Nota no válida");
            }
        }
        else
        {
          
        }
        
        System.out.println(notas.get(posicion));
    }
    /**
     * Muestra por pantalla el nombre del alumno y muestra sus notas
     */
    public void imprimirCalificaciones()
    {
        System.out.println("El nombre del alumno es: " + this.getNombre());
        System.out.println("Las notas son: " + this.notas);
    }
}
