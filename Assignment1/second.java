package Assignment1;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        
        double p,r,n,ans;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Principle Amount :- ");
        p = sc.nextDouble();
        System.out.print("\nEnter Rate Of Intrest :- ");
        r = sc.nextDouble();
        System.out.print("\nEnter Time Period :- ");
        n = sc.nextDouble();
    
        ans = (p*r*n)/100;

        System.out.print("\n\nSimple Intrest :-  "+ans);
    }
}
