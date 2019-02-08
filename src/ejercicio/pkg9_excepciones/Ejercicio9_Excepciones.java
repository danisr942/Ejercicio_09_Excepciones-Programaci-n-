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
    public static void main(String[] args) throws MisteriosaException {

        // DANIEL SANTANA RUIZ
        Alumno alumno = new Alumno("Dani");
        try {

            alumno.pedirNotas();
            alumno.modificarNota(5, 4);
            
        } catch (RangoException error) {
            System.err.println("Error. Nota no válida");
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Posición no válida");
        }
        alumno.imprimirCalificaciones();
    }

}
