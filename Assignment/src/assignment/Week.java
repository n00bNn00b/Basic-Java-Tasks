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
public class Week {
    int day;
    
    int dayIn () {
        System.out.println("This Program is to determine the name of the day of a week.");
        System.out.println("Input a day number: ");
        Scanner inp = new Scanner(System.in);
        day = inp.nextInt();
        
        if (day == 1) {
            System.out.println("The day is Saturday");
        }
        else if (day == 2) {
            System.out.println("The day is Sunday");
        }
        else if (day == 3) {
            System.out.println("The day is Monday");
        }
        else if (day == 4) {
            System.out.println("The day is Tuesday");
        }
        else if (day == 5) {
            System.out.println("The day is Wednesday");
        }
        else if (day == 6) {
            System.out.println("The day is Thursday");
        }
        else if (day == 7) {
            System.out.println("The day is Friday");
        }
        else {
            System.out.println("Invalid Input!");
        }
        return 0;
    }
}
