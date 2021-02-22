package com.mycompany.contatore;

/**
 *
 * @author informatica
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer c = 50;
        
        Thread t1 = new Thread(new Incremento(c));
        Thread t2 = new Thread(new Decremento(c));
        
        t1.start();
        t2.start();
        
    }
    
}
