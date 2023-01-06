//Write a program to create an array to store 5 integer values. Also initialize the array with 5 numbers and display the array Elements in reverse order. 
package Assignment2;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("\nEnter "+(i+1)+" Value : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\n\nEntered Array is : [ ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ]");
    }
}
