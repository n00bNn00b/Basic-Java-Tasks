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
public class Prime {
    int num;
    int i;
    boolean flag = false;
    void prime() {
        System.out.println("Enter an Integer: ");
        Scanner val_in = new Scanner(System.in);
        num = val_in.nextInt();
        for (i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
    }
        if (!flag)
            System.out.println("Your input number is " + num + " and it is a prime number.");
        else
            System.out.println("Your input number is " + num + " and it is not a prime number.");
    
}
    
}
