//Write a java program to display powers of 2 i.e. 2,4,8,16 etc up to 1024 using bitwise operators.
package Assignment1;

public class six {
  
    public static void main(String[] args) {
        
        int pow=1;
        for(int i=0;i<10;i++)
        {
            pow = pow << 1;     // pow = pow * 2^1
            System.out.print(pow+" ");
        }


    }

}
