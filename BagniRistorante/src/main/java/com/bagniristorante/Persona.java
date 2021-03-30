package com.bagniristorante;

/**
 *
 * @author User
 */
public class Persona implements Runnable {
    
    private final String nome;
    private final boolean uomo; // true = uomo false = donna
    private final Bagno bagno;
    
    public Persona(String nome, boolean uomo, Bagno b) {
        this.nome = nome;
        this.uomo = uomo;
        bagno = b;
    }
    
    @Override
    public void run() {
        bagno.utilizza(nome, uomo);
    }
    
}
