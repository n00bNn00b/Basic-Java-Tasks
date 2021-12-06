/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Palindrome {
    void palindrome() {
       System.out.println("Enter the number: ");
       Scanner sc = new Scanner(System.in);
       String reverse = "";
       String num = sc.nextLine();
       int length = num.length();
       for (int i = length-1; i >= 0; i--) {
           reverse = reverse + num.charAt(i);
       }
       if (num.equals(reverse)) {
           System.out.println("Palindrome");
       }
       else {
           System.out.println("not P");
        
    }
   
   }
}