//Write a program to convert inches to centimeters.

package Assignment1;

import java.util.Scanner;

public class eight {
  
    double convert(Double inch)
    {
        return inch*2.54;
    }

    public static void main(String[] args) {
        
        double inch;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter inches to convert to Feet :- ");
        inch = sc.nextDouble();

        eight obj = new eight();

        System.out.print("\nInches Converted Into feet :- "+obj.convert(inch));

    }

}
