//Write a program to find sum of two matrices of 3 x3.
package Unit2_Practicals;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int arr1[][] = new int [3][3];
        int arr2[][] = new int [3][3];
        int arr3[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter First Matrix :- \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\nEnter ["+i+"]["+j+"] Element :- ");
                arr1[i][j] =sc.nextInt();
            }
        }
        System.out.print("\nEnter Second Matrix :- \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\nEnter ["+i+"]["+j+"] Element :- ");
                arr2[i][j] =sc.nextInt();
            }
        }
        System.out.print("\nSum of Two Metrices :- \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print((arr1[i][j]+arr2[i][j])+" ");
            }
            System.out.println();
        }
    }
}
