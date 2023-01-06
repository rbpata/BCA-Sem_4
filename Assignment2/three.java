//Write a program to demonstrate calculator using switch statement

package Assignment2;

import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

        double no1,no2;

        System.out.println("Enter two Numbers : ");
        no1 = sc.nextDouble();
        no2 = sc.nextDouble();

        System.out.println("Enter your choice (+,-,/,*,%) :-");
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+': System.out.println("Addition = "+(no1+no2));
                        break;
            case '-': System.out.println("Subtraction = "+(no1-no2));
                        break;
            case '/': System.out.println("Divisioin = "+(no1/no2));
                        break;
            case '*': System.out.println("Multiplication = "+(no1*no2));
                        break;
            case '%': System.out.println("Modules = "+(no1%no2));
                        break;
        }
    }
}
