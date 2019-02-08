/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9_excepciones;

/**
 * Esta excepcion muestra un mensaje
 * @author Dani
 */
public class MisteriosaException extends ArrayIndexOutOfBoundsException {

    public MisteriosaException(String mensaje) {
        super(mensaje);
    }
}
