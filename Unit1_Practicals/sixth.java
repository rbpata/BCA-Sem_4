//Write a program to calculate the area of square and rectangle by overloading area
//method.

package Unit1_Practicals;

import java.util.*;

public class sixth {
    public static void main(String[] args) {

        int ch;
        double a, l, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your Choice (1.Squere 2.Rectangle) :- ");
        ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.print("\nEnter Size of the Side in Squere :- ");
                a = sc.nextDouble();

                System.out.print("\nArea of A Squere = " + (a * a));
                break;

            case 2:
                System.out.print("\nEnter Length :- ");
                l = sc.nextDouble();

                System.out.print("\nEnter Widht :- ");
                b = sc.nextDouble();

                System.out.print("\nArea of a Rectangle = " + (l * b));
                break;
            default:
                System.out.print("\nInvalid Choice...");
                break;
        }
    }
}
