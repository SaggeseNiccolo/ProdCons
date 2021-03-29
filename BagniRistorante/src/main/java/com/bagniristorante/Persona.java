package com.bagniristorante;

/**
 *
 * @author User
 */
public class Persona implements Runnable {

    private final String nome;
    private final boolean uomo; // true = uomo false = donna

    public Persona(String nome, boolean uomo, Bagno x) {
        this.nome = nome;
        this.uomo = uomo;
    }

    @Override
    public synchronized void run() {
        System.out.print(nome + " sta utilizzando il bagno");
        if (uomo == true) {
            System.out.println(" per gli uomini");
        } else {
            System.out.println(" per le donne");
        }
    }

}
