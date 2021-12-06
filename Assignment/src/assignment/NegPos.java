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
public class NegPos {
    int x;
    
    int negPos () {
        System.out.println("Input a Integer: ");
        Scanner val_in = new Scanner(System.in);
        x = val_in.nextInt();
        
        if (x > 0) {
            System.out.println("This is a Positive Number.");
        }
        else if (x < 0) {
            System.out.println("This is a Negative Number.");
        }
        else {
            System.out.println("The Number is Zero");
        }
        
        
        return 0;
    }
}
