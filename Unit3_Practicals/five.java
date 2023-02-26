// Write a Java program to input n integer numbers and display lowest and second lowest number.
// Also handle the different exceptions possible to be thrown during execution.

package Unit3_Practicals;

import java.util.Scanner;

public class five {
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

            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int  temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            min = arr[0];
            secMin = arr[1];

            System.out.print("\nLowest value is :- " + min + " \nSecond Lowest is :- " + secMin);
        } catch (Exception e) {
            System.out.println("\nError of " + e);
        }
    }
}
