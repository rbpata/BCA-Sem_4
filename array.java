import java.util.*;

public class array {
    
    public static void main(String argv[]) {
        
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size : ");
        size = sc.nextInt();
        int []arr = new int[size];

        for(int i = 0;i<size ; i++)
        {
            System.out.println("Enter "+(i+1)+"value : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
