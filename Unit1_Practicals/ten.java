//Write a program to display powers of 2 i.e., 2, 4, 8, 16 etc. up to 1024 using Shift
//operator.
package Unit1_Practicals;

public class ten {
    public static void main(String[] args) {
        
        int pow=1;
        for(int i=0;i<10;i++)
        {
            pow = pow << 1;     // pow = pow * 2^1 (left shift)
            System.out.print(pow+" ");
        }
    }

}
