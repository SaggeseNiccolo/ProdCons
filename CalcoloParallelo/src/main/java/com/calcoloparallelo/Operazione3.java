package com.calcoloparallelo;

/**
 *
 * @author User
 */
public class Operazione3 implements Runnable {

    Buffer dati;
    private double b = 3;
    private double c;
    private double a = 3;

    public Operazione3(Buffer d) {
        dati = d;
        c = dati.c;
    }

    @Override
    public void run() {
        dati.z = a * (c - b);
        System.out.println("Ho calcolato z: " + dati.z);
    }

}
