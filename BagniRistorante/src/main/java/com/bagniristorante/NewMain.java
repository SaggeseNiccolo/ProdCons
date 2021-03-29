package com.bagniristorante;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BagnoUomo bagnoUomo = new BagnoUomo();
        BagnoDonna bagnoDonna = new BagnoDonna();

        Persona p1 = new Persona("p1", true, bagnoUomo);
        Persona p2 = new Persona("p2", false, bagnoDonna);
        Persona p3 = new Persona("p3", true, bagnoUomo);
        Persona p4 = new Persona("p4", false, bagnoDonna);
        Persona p5 = new Persona("p5", true, bagnoUomo);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
