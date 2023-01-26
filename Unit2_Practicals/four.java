//Write program to create an array of company name and another array of price 
//quoted by the company. Fetch the company name who has quoted the lowest 
//amount.

package Unit2_Practicals;

import java.util.Scanner;

public class four {
    
    public static void main(String[] args) {
        int size,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Many Elements :- ");
        size = sc.nextInt();
        String str[] = new String[size];
        int price[] = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("\nEnter Company Name :- ");
            str[i] = sc.next();
            System.out.print("\nEnter Price Of the Product :- ");
            price[i] = sc.nextInt();
        }

        min = price[0];
        for(int i=0;i<size;i++)
        {
            if(price[i] < min)
                min = price[i];
        }

        for(int i=0;i<size;i++)
        {
            if(price[i] == min)
            {
                System.out.print("\nWith Lowest Price Product is...");
                System.out.print("\nCompany Name :- "+str[i]+"\nPrice :- "+price[i]);
            }
        }

    }
}
