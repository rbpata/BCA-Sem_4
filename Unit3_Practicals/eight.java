// Write a program which takes the age of 5 persons from command line and find the average age
// of all persons. The program should handle exception if the argument is not correctly formatted
// and custom exception if the age is not between 1 to 100.

package Unit3_Practicals;

class UnderAge extends Exception
{
    public UnderAge()
    {
        super();
    }
}

class eight {
 
    public static void main(String[] args) {
         
        int [] arr = new int [5];
        int sum=0;
        try{
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(args[i]);
            if(arr[i] < 1 || arr[i] > 100 )
            {
                throw new UnderAge();
            }
            sum += arr[i];
        }
        double average = (double) sum / 5;

        System.out.print("\nAverage Age :- "+average);
    }
    catch(UnderAge u)
    {
        System.out.println("\nAge must be between 1 and 100 !!");
    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println("Age arguments not provided for all 5 persons.");
    }
    }

}
