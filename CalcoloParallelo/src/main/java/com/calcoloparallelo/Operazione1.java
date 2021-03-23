package com.calcoloparallelo;

/**
 *
 * @author User
 */
public class Operazione1 implements Runnable {

    Buffer dati;
    private double b = 1;
    private double c = 3;
    private double a;

    public Operazione1(Buffer d) {
        dati = d;
        a = dati.a;
    }

    @Override
    public void run() {
        dati.x = c * (a - b);
        System.out.println("Ho calcolato x: " + dati.x);
    }
}
