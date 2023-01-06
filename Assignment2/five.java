//Write a program to create integer array containing 10 values. Then print all the prime numbers contained by the array. 
package Assignment2;

import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter " + (i + 1) + " Value : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\n\n Prime Numbers : [ ");
        for(int i=0; i<arr.length; i++){
            boolean Prime = true;
            
            //check to see if the numbers are prime
            for (int j=2; j<arr[i]; j++){
                
                if(arr[i]%j==0){
                    Prime = false;
                    break;
                }
            }
            //print the number
            if(Prime)
    
                System.out.print(arr[i]);
        }
        System.out.println(" ]");

    }
}
