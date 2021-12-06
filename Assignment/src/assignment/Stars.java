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
public class Stars {
    int n;
    int i;
    int j;
    
    void star () {
        System.out.println("Enter an Integer Value: ");
        Scanner val_in = new Scanner(System.in);
        n = val_in.nextInt();
       
        for (i = 1; i <= n; ++i) {
            for (j = 1; j <=n; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
