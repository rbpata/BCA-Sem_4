// Write an application that converts between meters and feet. Its first command-line argument is
// a number and second command line argument is either “centimetre” or”meter”. If the
// argument equals “centimetre” displays a string reporting the equivalent number of meters. If
// this argument equals “meters”, display a string reporting the equivalent number of centimetre.
// If unit is not given properly then generate custom exception Unitformatexception. If first
// argument is not proper format then generate numberformatexception. Generate other
// exception as per requirements. (1 meter=100 centimetre)

package Unit3_Practicals;

import java.lang.*;

class Unitformatexception extends Exception
{
    public Unitformatexception()
    {
        super();
    }
}

class nine {
    public static void main(String[] args) {
        
        double num = Integer.parseInt(args[0]);
        String str = args[1];
        
        try{

            if(str.equals("cm") || str.equals("CM"))
            {
                double meter = num/100;
                System.out.printf("%f centimetres is equivalent to %f meters", num, meter);
            }
            else if(str.equals("m") || str.equals("M"))
            {
                double cm = num*100;
                System.out.printf("%f meters is equivalent to %f centimetres", num, cm);
            } 
            else {
                    throw new Unitformatexception();
            }
        }
        catch(Unitformatexception u)
        {
            System.out.println("\nInvalid unit format !!");
        }
        catch(NumberFormatException e)
        {
            System.out.println("\nInvalid Number format !!");
        }
        catch(Exception e)
        {
            System.out.println("\nError!!");
        }

    }    
}
