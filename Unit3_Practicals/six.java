// Write a program that takes a string from the user and validate it. The string should be at least 5
// characters and should contain at least one digit. Display an appropriate valid message.

package Unit3_Practicals;

import java.util.Scanner;

public class six {
    
    public static void main(String[] args) {
        
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter String :- ");
        str = sc.nextLine();

        if(str.length() < 5)
        {
            System.out.print("Error: The string should be at least 5 characters.");
        }
        else if(!str.matches(".*\\d.*"))
        {
            System.out.print("Error: The string should contain at least one digit !!");   
        }
        else
        {
            System.out.print("\nValid String !!");
        }

    }
    
}



// -->>>Second mathod


// public static void main(String[] args) {

//     Scanner input = new Scanner(System.in);
//     System.out.print(
//             "1. A password must have at least eight characters.\n" +
//             "2. A password consists of only letters and digits.\n" +
//             "3. A password must contain at least two digits \n" +
//             "Input a password (You are agreeing to the above Terms and Conditions.): ");
//     String s = input.nextLine();

//     if (is_Valid_Password(s)) {
//         System.out.println("Password is valid: " + s);
//     } else {
//         System.out.println("Not a valid password: " + s);
//     }

// }

// public static boolean is_Valid_Password(String password) {

//     if (password.length() < PASSWORD_LENGTH) return false;

//     int charCount = 0;
//     int numCount = 0;
//     for (int i = 0; i < password.length(); i++) {

//         char ch = password.charAt(i);

//         if (is_Numeric(ch)) numCount++;
//         else if (is_Letter(ch)) charCount++;
//         else return false;
//     }


//     return (charCount >= 2 && numCount >= 2);
// }

// public static boolean is_Letter(char ch) {
//     ch = Character.toUpperCase(ch);
//     return (ch >= 'A' && ch <= 'Z');
// }