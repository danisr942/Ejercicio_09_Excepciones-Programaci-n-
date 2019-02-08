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

    static int num_asignaturas;
    private String nombre;
    ArrayList<Double> notas = new ArrayList<>();

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
        for (int i = 0; i < 5; i++) {
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

    public void modificarNota(int posicion, double nnota) throws RangoException, MisteriosaException {
        
    }

}
