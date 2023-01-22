//A shop during festival season offers a discount 10% for purchase made up to Rs. 1000,
//12% for purchase value of Rs. 1000or more up to Rs. 1500 and 15% for purchase value
//of Rs. 1500 or more. Write a program to implement the above scheme for a given sales
//and print out the sales and print out the sales value, discount and net amount payable
//by a customer. Create necessary methods and constructors.

package Unit1_Practicals;

import java.util.*;

class Calc {
    int price, disc;    
    float net;

    Calc() {
        price = disc = 0;
        net = 0;
    }

    void netPay(int amt) {
        
        if (amt < 1000)
        {
            disc = 10;
        }
        else if (amt >= 1000 && amt < 1500)
        {
            disc = 12;
        }
        else
        {
            disc = 15;
        }
        net = amt - ((disc * amt) / 100);
        System.out.print("\nNetvalue  for " + amt + " is '" + net+"'");
    }
}

public class eight

{

    public static void main(String args[])

    {

        int price;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Purhase value :- ");

        price = sc.nextInt();

        Calc c1 = new Calc();

        c1.netPay(price);

    }

}
