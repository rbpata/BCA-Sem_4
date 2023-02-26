// Write a program that accepts 5 even numbers from command line, if any of the numbers is odd
// then throw custom exception OddException and count such invalid numbers.

package Unit3_Practicals;

class oddexception extends Exception {
    oddexception(String msg, int j) {
        System.out.print("\n" + msg);
        System.out.print("\nInvalid Number is :- " + j);
    }
}

class ten {
    public static void main(String[] args) throws oddexception {

        int[] no = new int[5];
        int j = 0;

        for (int i = 0; i < 5; i++) {
            try {
                no[i] = Integer.valueOf(args[i]);
                if (no[i] % 2 != 0) {
                    j++;
                    throw new oddexception("Number is odd", no[i]);
                }

            } catch (oddexception e) {
                e.getMessage();
            }
        }
        System.out.print("\n\n\nNumber of Odd Numbers :- " + j);
    }
}
