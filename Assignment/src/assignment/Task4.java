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
public class Task4 {
    Float x;
    
    Float num () {
        System.out.println("This Program is to determine whether the number is positive, negative or zero and if it it positive small or positive large.");
        Scanner inp = new Scanner(System.in);
        System.out.println("Input the integer value: ");
        x = inp.nextFloat();
        
        if (x > 0) {
            if (x < 1) {
                System.out.println("This is Small Positive Number");
            }
            else if (x > 1000000) {
                System.out.println("This is Large Positive Number.");
            }
            else {
                System.out.println("This is Positive Number.");
            }
        }
        else if (x < 0) {
            System.out.println("This is Negative Number.");
        }
        else {
            System.out.println("This Number is Zero");
        }
        
        
        return null;
        
    }
    
}
