//Write a program to sort the elements of one dimensional array. Read value of 
//array elements through command line argument.
package Unit2_Practicals;

public class first {
    public static void main(String[] args) {
        
        int size = args.length;
        int temp;
        int arr [] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.print("\nSorted Elements :- ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
