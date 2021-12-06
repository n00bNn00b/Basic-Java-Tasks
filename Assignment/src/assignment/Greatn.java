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
public class Greatn {
    int num1, num2, num3, num4, num5;
    
    int grt() { 
        System.out.println("This Program is to determine the greatest number.");
        System.out.println("Input the first integer: ");
        Scanner inp =new Scanner(System.in);
        num1 = inp.nextInt();
        System.out.println("Input the second integer: ");
        num2 = inp.nextInt();
        System.out.println("Input the third integer: ");
        num3 = inp.nextInt();
        System.out.println("Input the fouth integer: ");
        num4 = inp.nextInt();
        System.out.println("Input the fifth integer: ");
        num5 = inp.nextInt();
        
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println(num1 + " is the greatest Number.");
        }
        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println(num2 + " is the greatest Number.");
        }
        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println(num3 + " is the greatest Number.");
        }
        else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println(num4 + " is the greatest Number.");
        }
        else {
            System.out.println(num5 + " is the greatest Number.");
        }
        return 0;
    }
}
