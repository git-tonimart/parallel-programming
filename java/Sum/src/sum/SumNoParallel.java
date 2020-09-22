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
public class SumNoParallel {

    private int sum;
    private int x, y;
    private String name;

    public SumNoParallel(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int sum() {

        for (int i = this.x; i <= this.y; i++) {
            this.sum += i;
        }
        System.out.println(this.name + " has end.");
        return this.sum;
    }

    public static void main(String[] args) {
        long date_a = new Date().getTime();
        SumNoParallel sum1 = new SumNoParallel("Sum 1", 1, 24);
        SumNoParallel sum2 = new SumNoParallel("Sum 2", 25, 49);
        SumNoParallel sum3 = new SumNoParallel("Sum 3", 50, 74);
        SumNoParallel sum4 = new SumNoParallel("Sum 4", 75, 100);
        int sumA = sum1.sum();
        int sumB = sum2.sum();
        int sumC = sum3.sum();
        int sumD = sum4.sum();
        System.out.println("Result -> The total sum is: " + (sumA + sumB + sumC + sumD));
        long date_b = new Date().getTime();
        System.out.println("Time -> Total time in milliseconds: " + (date_b - date_a));
    }
}
