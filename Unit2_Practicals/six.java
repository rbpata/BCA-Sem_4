//Create a class called NumberData that accept any array of the five numbers. 
// Create a sub class called Numplay which provides methods for followings:
// 1. Display numbers entered.
// 2. Sum of the number.
// 3. Average of the numbers.
// 4. Maximum of the numbers.
// 5. Minimum of the numbers.
// Create a class that provides menu for above methods. Give choice from the 
// command-line argument.
package Unit2_Practicals;

import java.util.Scanner;

class NumberData{
    int [] arr = new int[5];
    public void GetData()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("\nEnter "+(i+1)+" Element :- ");
            arr[i] = sc.nextInt();
        }
    }
}
class Numplay extends NumberData{

    int sum=0,avg,max,min;
    public void Display()
    {
        System.out.print("\nEntered Elements are :- ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void Sum()
    {
        for(int i=0;i<5;i++)
        {
            sum = sum+arr[i];
        }
        System.out.print("\nTotal :- '"+sum+"'");
    }
    public void Average()
    {
        avg = sum/5;
        System.out.print("\nAverage :- '"+avg+"'");
    }
    public void Maximum()
    {
        max = arr[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.print("\nMaximun :- '"+max+"'");
    }
    public void Minimum()
    {
        min = arr[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i]<min)
            {
                max = arr[i];
            }
        }
        System.out.print("\nMinimun :- '"+min+"'");
    }
}

public class six {
    
    public static void main(String[] args) {

        Numplay obj = new Numplay();
        obj.GetData();
        System.out.print("\n------------------------------------------------------\n");
        obj.Display();
        obj.Sum();
        obj.Average();
        obj.Maximum();
        obj.Minimum();

    }

}
