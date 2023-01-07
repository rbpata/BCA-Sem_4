//Write a program to find maximum of two numbers without using third variable
package Assignment1;

import java.util.*;
import java.lang.Math;

public class third {
  
    public static void main(String[] args) {
        int no1,no2;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter No 1 :- ");
        no1 = sc.nextInt();
        System.out.print("\nEnter No 2 :- ");
        no2 = sc.nextInt();    

        System.out.print("\n\nMaximum From two Number is :- "+Math.max(no1, no2));
    }

}
