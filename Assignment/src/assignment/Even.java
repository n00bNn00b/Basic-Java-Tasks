package assignment;

import java.util.Scanner;


public class Even {
    int n;
    int m;
    int i;
    
    void even() {
        System.out.println("Enter a Starting Integer: ");
        Scanner val_in = new Scanner(System.in);
        n = val_in.nextInt();
        System.out.println("Enter an Ending Integer: ");
        m = val_in.nextInt();
        System.out.println("The Even Numbers between " + n + " & " + m + " are: ");
        for (i = n; i<= m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
    }
    
}
