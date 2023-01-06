//Write a program to print even number up to 10 using while loop

package Assignment2;

public class first {

    public static void main(String[] args) {

        int no = 0;

        while (no <= 10) {
            if (no % 2 == 0) {
                System.out.println(no);
                no++;
            } else {
                no++;
            }
        }
    }
}
