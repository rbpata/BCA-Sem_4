// Write an application that accepts marks of three different subject from user. Marks should be
// between 0 to 100, if marks of any of the subject is not belong to this range, generate custom
// exception out of RangeException: If marks of each subjects are greater than or equal to 40 then
// display message “PASS” along with percentage, otherwise display message “FAIL”. Also write
// exception handling code to catch all possible runtime exceptions likely to be generated in the
// program.

package Unit3_Practicals;

import java.util.Scanner;

class RangeException extends Exception {
    public RangeException(String str) {
        super(str);
    }
}

public class seven {

    public static void main(String[] args) {

        float[] marks = new float[3];
        float totalMarks = 0;
        float percentage;
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("\nEnter Marks Of Three Subject :- \n");
            for (int i = 0; i < 3; i++) {
                System.out.print("\nEnter Sub " + (i + 1) + " Marks :-");
                marks[i] = sc.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    throw new RangeException("Marks should be between 0 and 100.");
                }
                totalMarks += marks[i];
            }
            percentage = totalMarks / 3;
            if (percentage >= 40) {
                System.out.println("PASS with " + percentage + "%");
            } else {
                System.out.println("FAIL with " + percentage + "%");
            }
        } catch (RangeException r) {
            System.out.println("Error: " + r.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
};
