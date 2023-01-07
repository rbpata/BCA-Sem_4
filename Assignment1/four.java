//Write a program using the arithmetic operators to perform algebraic operations on two numbers. (Algebraic operation is +, - , *, /, %) 

package Assignment1;

import java.util.Scanner;

public class four {

    public static void main(String[] args) {

        double no1,no2;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter No1 :-");
        no1 = sc.nextDouble();
        System.out.print("\nEnter No2 :- ");
        no2 = sc.nextDouble();

        System.out.print("\nAddition :-  "+(no1+no2));
        System.out.print("\nSubtraction :-  "+(no1-no2));
        System.out.print("\nMultiplication :-  "+(no1*no2));
        System.out.print("\nDivisioin :-  "+(no1/no2));
        System.out.print("\nModules :-  "+(no1%no2));

    }

}
