//Write a program to create a character array to store 6 
//characters. Also initialize the array with 6 random characters. 
//Now create another array containing 10 characters. Copy the 
//elements ranging from index 2 to 4of first array to second 
//array at the same index.
package Assignment2;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char []str2 = new char[4];


        char []str = {'a','b','c','d','e','f'};
        for(int i=0;i<str2.length;i++)
        {
                str2[i]= str[i+1];
        }
        System.out.print("\nNew char array : ");
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str2[i]+" ");
        }
    }
}
