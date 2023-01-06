//Write a program to calculate the hypotenuse of right angled 
//triangle when other sides of the triangle are given. 
//(Hypotenuse = square root (x*x + Y *Y)) 

package Assignment1;

import java.util.Scanner;
import java.math.*;

public class first {

    public static void main(String[] args) {

        double hypo, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter X side of the Trinanlge : ");
        x = sc.nextDouble();
        System.out.print("\nEnter Y side of the Trinanlge : ");
        y = sc.nextDouble();

        hypo  = Math.sqrt((x*x)+(y*y));

        System.out.print("\nHypotenuse of a Right Triangle :- "+hypo);
    }
}
