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
public class Greatest {
    int x, y, z;
    
    int grt() { 
        System.out.println("This Program is to determine the greatest number.");
        System.out.println("Input the first integer: ");
        Scanner inp =new Scanner(System.in);
        x = inp.nextInt();
        System.out.println("Input the second integer: ");
        y = inp.nextInt();
        System.out.println("Input the third integer: ");
        z = inp.nextInt();
        
        if (x > y && x > z) {
            System.out.println(x + " is the greatest Number.");
        }
        else if (y > x && y > z) {
            System.out.println(y + " is the greatest Number.");
        }
        else if (z > x && z > y) {
            System.out.println( z + " is the greated Number.");
        }
        else {
            System.out.println("Equal Numbers Detected!");
        }        
        return 0;
    }
}
