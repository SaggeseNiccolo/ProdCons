package com.prodcons;

import java.util.concurrent.*;
import java.util.logging.*;

/**
 *
 * @author User
 */
public class Produttore extends Thread {

    private int dato;
    private final LinkedBlockingQueue coda;

    public Produttore(LinkedBlockingQueue coda) {
        this.coda = coda;
    }

    @Override
    public void run() {

        for (int i = 0; i < NewMain.tanti; i++) {
            dato = NewMain.dato;
            NewMain.dato++;
            try {
                coda.put(dato);
                System.out.println(Thread.currentThread().getName() + " Dato scritto: " + dato);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("Scrittura terminata " + Thread.currentThread().getName());

    }

}
