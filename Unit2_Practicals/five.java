//Write an interface called numbers, with a method in Process(int x, int y). Write a 
//class called Sum, in which the method Process finds the sum of two numbers 
//and returns an int value. Write another class called Average, in which the 
//Process method finds the average of the two numbers and returns an int.

package Unit2_Practicals;

import java.util.Scanner;

interface numbers {
    int Process(int x, int y);
}

class Sum implements numbers {

    public int Process(int x, int y) {
        return x + y;
    }

}

public class five {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter First Number :- ");
        a = sc.nextInt();
        System.out.print("\nEnter Second Number :- ");
        b = sc.nextInt();

        Sum obj = new Sum();
        System.out.print("\nSum Of A and B :- " + obj.Process(a, b));

    }
}
