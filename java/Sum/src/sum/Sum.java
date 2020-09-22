/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Date;

/**
 *
 * @author Toni Mart https://github.com/git-tonimart
 */
public class Sum extends Thread {

    public static int sum;

    private int x, y;

    public Sum(String name, int x, int y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        for (int i = x; i <= y; i++) {
            Sum.sum += i;
        }
        System.out.println(getName() + " has end.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long date_a=new Date().getTime();
        
        Thread t1 = new Sum("Thread 1", 1, 24);
        Thread t2 = new Sum("Thread 2", 25, 49);
        Thread t3 = new Sum("Thread 3", 50, 74);
        Thread t4 = new Sum("Thread 4", 75, 100);
        t1.start();
        t2.start();
        t3.start();
        t4.start();       
        System.out.println("Result -> The total sum is: "+Sum.sum);
        long date_b=new Date().getTime();
        System.out.println("Time -> Total time in milliseconds: "+(date_b-date_a));

    }

}
