//Write a java program that accepts a string from users and display each character on separate line in reverse order. 

package Assignment2;

import java.util.Scanner;

public class eight {

    public static void main(String[] args) {
        
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter String to Print in reverse Order :- ");
    
        str = sc.nextLine();

        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.println(str.charAt(i));
        }
    }
}
