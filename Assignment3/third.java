//Write a Java program to input n integer numbers and display lowest and second lowest number. Also handle the different exceptions possible to be thrown during execution. 

package Assignment3;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int size, min, secMin = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of the array :- ");
        size = sc.nextInt();
        int[] arr = new int[size];

        try {
            for (int i = 0; i < size; i++) {
                System.out.print("\nEnter " + (i + 1) + " Element :- ");
                arr[i] = sc.nextInt();
            }
            min = arr[0];

            for (int i = 0; i < size; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    secMin = i;
                }
            }
            System.out.print("\nLowest value is :- " + min + " \nSecond Lowest is :- " + arr[secMin - 1]);
        } catch (Exception e) {
            System.out.println("\nError of " + e);
        }
    }
}
