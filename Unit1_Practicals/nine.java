//A bank gives 6.5% per annum interest on deposits made in that bank. Write a program
// to calculate the total amount that a person will receive after the end of 5 years for a
//deposit of Rs. 5000 for compound interest.
package Unit1_Practicals;

class Compound {
    double p, r, n;

    Compound(double a, double b, double c) {
        this.p = a;
        this.r = b;
        this.n = c;
    }

    void Calc() {
        // formula of the Compound intrest
        double cmp = p * (Math.pow((1 + (r / 100)), n));
        double tot = cmp + p;

        System.out.print("\nPrincipal Amount :- " + p + "\nRate Of Intrest :- " + r + "\nTime Period :- " + n);
        System.out.print("\n\nTotal Intrest :- " + cmp + "\nTotal Amount after Compound Intrest :- '" + tot + "'");
    }

}

public class nine {

    public static void main(String[] args) {

        double p=5000,r=6.5,n=5;

        Compound obj = new Compound(p, r, n);

        obj.Calc();
    }

}
