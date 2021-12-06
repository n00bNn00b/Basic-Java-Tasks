/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Odd {
    void lab1() {
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println("EUB");
        }
    }
    void lab2() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    void lab3()
    {
        int i;
        for (i = 1; i<=10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
    void lab4 () {
        int i;
        int n;
        System.out.println("Input an integer: ");
        Scanner val_in = new Scanner(System.in);
        n = val_in.nextInt();

        for (i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
