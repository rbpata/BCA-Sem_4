//Write a program to create an array to store 5 integer values. Also initialize the 
//array with 5 numbers and display the array Elements in reverse order.
package Unit2_Practicals;

public class second {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.print("\nReverse Order Array :- ");
        for(int i=4;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
