package com.bagniristorante;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Bagno {

    public synchronized void utilizza(String nome, boolean uomo) {

        System.out.print(nome + " sta utilizzando il bagno");
        if (uomo == true) {
            System.out.println(" per gli uomini");
        } else {
            System.out.println(" per le donne");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (uomo == true) {
            System.out.println(nome + " è uscito dal bagno");
        } else {
            System.out.println(nome + " è uscita dal bagno");
        }

    }

}
