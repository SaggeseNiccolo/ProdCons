package com.prodcons;

import java.util.concurrent.*;
import java.util.logging.*;

/**
 *
 * @author User
 */
public class Consumatore extends Thread {

    private int dato;
    private final LinkedBlockingQueue coda;

    public Consumatore(LinkedBlockingQueue coda) {
        this.coda = coda;
    }

    @Override
    public void run() {

        for (int i = 0; i < NewMain.tanti; i++) {
            try {
                Object value = coda.take();
                System.out.println(Thread.currentThread().getName() + " Dato letto: " + value);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
