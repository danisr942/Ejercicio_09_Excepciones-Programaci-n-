/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9_excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani
 */
public class Ejercicio9_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // DANIEL SANTANA RUIZ
        Alumno alumno = new Alumno();
        try {

            alumno.pedirNotas();
        } catch (RangoException error) {
            System.err.println("Error. Nota no válida");
        }
    }

}
