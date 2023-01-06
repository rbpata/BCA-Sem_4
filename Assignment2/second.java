//Write a program to check whether the given number is even or odd. 

package Assignment2;

import java.util.*;

public class second {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Wether it is ODD or EVEN :- ");
        int No = sc.nextInt();

        if(No%2 == 0)
        {
            System.out.println("Number is even..");
        }
        else
        {
            System.out.println("Number is Odd..");
        }
    }
}
