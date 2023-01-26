// Write an interface called Exam with a method Pass(int mark) that returns a 
// Boolean. Write another interface called Classify with a method Division(int 
// average) which returns a string. Write a class called Result which implements 
// both Exam and Classify. The pass method should return true if the marks is 
// greater than or equal to 35 else false. The division method must return “First” 
// when the parameter average is 60 or more, “second” when average is 50 or 
// more but below 60, “no division” when average is less than 50.
package Unit2_Practicals;

interface Exam {
    boolean Pass(int mark);
}

interface Classify {
    String Division(int avg);
}

class Result implements Exam, Classify {

    public boolean Pass(int mark) {
        if (mark >= 35) {
            return true;
        } else {
            return false;
        }
    }

    public String Division(int avg) {
        if (avg >= 60) {
            return "First";
        } else if (avg >= 50 && avg < 60) {
            return "Second";
        } else {
            return "No Division";
        }
    }

}

public class eight {
    public static void main(String[] args) {

        Result obj = new Result();
        Result obj2 = new Result();
        // First Object
        System.out.print("\n-----------First Object----------- \n\nPassing Status :- ");
        System.out.print(obj.Pass(69));
        System.out.print("\nDivision :- ");
        System.out.println(obj.Division(55));

        // Second Object
        System.out.print("\n\n-----------Second Object----------- \n\nPassing Status :- ");
        System.out.print(obj2.Pass(25));
        System.out.print("\nDivision :- ");
        System.out.print(obj.Division(30));

    }
}
