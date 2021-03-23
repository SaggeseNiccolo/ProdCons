package com.calcoloparallelo;

/**
 *
 * @author User
 */
public class Operazione2 implements Runnable {

    Buffer dati;
    private double b;
    private double c = 2;
    private double a = 2;

    public Operazione2(Buffer d) {
        dati = d;
        b = dati.b;
    }

    @Override
    public void run() {
        dati.y = a * (b - c);
        System.out.println("Ho calcolato y: " + dati.y);
    }

}
