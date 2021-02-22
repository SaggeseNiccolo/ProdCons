package com.mycompany.contatore;

/**
 *
 * @author informatica
 */
public class Incremento implements Runnable {

    private Integer c;

    public Incremento(Integer c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (1 == 1) {
            if (c <= 100) {
                System.out.println(c);
                c++;
            }
        }
    }

}
