import java.util.*;
public class Table {
    public static void main(String argv[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number : ");
        int n = sc.nextInt();

        for(int i=1;i<11;i++)
        {
            System.out.println(n+"*"+i+"="+i*n);
        }

    }
}
