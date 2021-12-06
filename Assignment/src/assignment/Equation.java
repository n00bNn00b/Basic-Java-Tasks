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
public class Equation {
    int n;
    float u, a, t, s, v, v2;
    void eqn () {
        System.out.println("Enter an integer: ");
        Scanner val_in = new Scanner(System.in);
        n = val_in.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Enter the value of u: ");
            u = val_in.nextInt();
            System.out.println("Enter the value of a: ");
            a = val_in.nextInt();
            System.out.println("Enter the value of t: ");
            t = val_in.nextInt();
            s = ((u * t) + ((a * t * t) / 2));
            System.out.println("The Value of S is: " + s);
            
        }
        else {
            System.out.println("Enter the value of u: ");
            u = val_in.nextInt();
            System.out.println("Enter the value of a: ");
            a = val_in.nextInt();
            System.out.println("Enter the value of s: ");
            s = val_in.nextInt();
            v2 = ((u * u) + (2 * a * s));
            v = (float) Math.sqrt(v2);
            
            System.out.println("The value of v is: " + v);
            
        }
    }
    
}
