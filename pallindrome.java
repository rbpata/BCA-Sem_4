import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        int no,r,copy,s=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check pallindrom or not :- ");
        no = sc.nextInt();

        copy = no;
        while(no>0)
        {
                r = no%10;
                s = (s*10)+r;
                no = no/10;
        }

        if (copy == s) {
            System.out.println("Number is pallindrome");
        }
        else
        {
            System.out.println("Not pallindrome");
        }
    }
}
