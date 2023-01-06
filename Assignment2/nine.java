//Write a program to create a string array and sort all the string contained by the array. 
package Assignment2;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class nine {
    public static void main(String[] args) {
        
        int no=3;
        Scanner sc = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);
        System.out.print("\nHow Many Names :- ");
        no = sc.nextInt();
        String [] str = new String[no]; 

        for(int i=0;i<no;i++)
        {
            System.out.print("\nEnter "+(i+1)+" Name :- ");
            str[i] = sc.next();
        }

        Arrays.sort(str);

        System.out.println("\nShorted Elements :- ");
        for(int i=0;i<no;i++)
        {
            System.out.print("\n"+(i+1)+" "+str[i]);
        }
    }   
}
