//Write a program to scan 3 integer values from command line arguments and display the
//maximum using conditional operator.
package Unit1_Practicals;

import java.util.*;
public class four {
    public static void main(String[] args) {
        
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        n3 = Integer.parseInt(args[2]);

        System.out.print("\nMin From 3 is :- "+(n1<n2?n1:n2<n3?n2:n3));

    }
}
