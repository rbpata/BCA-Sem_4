//A motorcycle dealer sells two wheelers to his customer on loan, which is to be repaid in
//5 years. The dealer charges simple interest for the whole term on the day of giving the
//loan itself. The total amount is then divided by 60(months) and is collected as equated
//monthly instalment (EMI). Write a program to calculate the EMI for a loan of Rs. X,
//where X is a command line argument. Print the EMI value in rupees.

package Unit1_Practicals;

import java.util.Scanner;

class Emi{

    double emi;
    Emi(double p,double r,double m)
    {
        emi = (p*r*Math.pow(1+r, m)/(Math.pow(r+1, m)-1));
    }
    void show()
    {
        System.out.print("\n---------------------------------------------------");
        System.out.print("\nMonthly EMI Amount :- '"+emi+"'");
        System.out.print("\n---------------------------------------------------");
    }
}
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double p,rate,yr,r,m;
        System.out.print("\nEnter Principle Amount :- ");
        p = sc.nextDouble();
        System.out.print("\nEnter Rate of Intrest :- ");
        rate = sc.nextDouble();
        System.out.print("\nHow Many Years :- ");
        yr = sc.nextDouble();

        r = rate/(12*100);
        m = yr*12;

        Emi obj = new Emi(p,r,m);

        obj.show();
    }
}
