package Assignment2;
import java.util.*;


class string{
    String str;

    Scanner sc = new Scanner(System.in);
    public void get()
    {
        System.out.print("\nEnter any String You Find Pallindrome or not :- ");
        str = sc.nextLine();
    }
}
public class ten {
    
    public static void main(String[] args) {
        String copy="";

        string obj = new string();
        obj.get();

        for(int i=obj.str.length()-1;i>=0;i--)
        {
            copy = copy + obj.str.charAt(i);
        }

        if(copy.equals(obj.str))
        {
            System.out.print("\nIts a Pallindrome String..");
        }
        else
        {
            System.out.print("\nIts not pallindrome String..");
        }
    }
}
