package Assignment3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int size=0;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow Many Number to get the sum of :- ");
        size = sc.nextInt();
        int [] no = new int[size];
        try{
            for(int i=0;i<size;i++)
            {
                System.out.print("\nEnter value of "+(i+1)+" :- ");
                no[i] = sc.nextInt();
                sum = sum+no[i];
            }
            System.out.print("\n===============================================================");
            System.out.print("\nSum :- " +sum);
            System.out.print("\n===============================================================");
        }catch(InputMismatchException e) {
            System.out.println("Error.."+e);
        }
    }
}
