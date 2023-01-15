//Number Format Exception
public class nfe {
    public static void main(String[] args) {
        String str = "ram";

        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch(NumberFormatException n)
        {
            System.out.println("NumberFormatExeption");
        }
        

    }
}
