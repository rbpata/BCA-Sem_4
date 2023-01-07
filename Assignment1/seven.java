package Assignment1;

import java.util.Scanner;

public class seven {
    
    public static void main(String[] args) {
        
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter No1 :- ");
        n1 = sc.nextInt();
        System.out.print("\nEnter No2 :- ");
        n2 = sc.nextInt();
        System.out.print("\nEnter No3 :- ");
        n3 = sc.nextInt();

        System.out.print("\nMin From 3 is :- "+(n1<n2?n1:n2<n3?n2:n3));

    }

}
