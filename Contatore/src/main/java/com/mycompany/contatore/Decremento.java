package com.mycompany.contatore;

/**
 *
 * @author informatica
 */
public class Decremento implements Runnable {

    private Integer c;

    public Decremento(Integer c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (1 == 1) {
            if (c >= 0) {
                System.out.println(c);
                c--;
            }
        }
    }

}
