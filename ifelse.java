import java.util.*;

public class ifelse {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int a = sc.nextInt();
        if(a > 18)
        {
            System.out.println("Your are adult..");
        }
        else
        {
            System.out.println("You are not adult..");
        }

    }
}
