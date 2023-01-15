//Write a java program which takes 2 arguments - a string and its length. If the length of the string is not according to given one then throw the user defined LengthMatchException and handles it appropriately.

package Assignment3;

public class second {
    
    void match(String str,int len){
        if(len == str.length()){
            System.out.print("\nLength is Same!!");
        }
        else{
            throw new StringIndexOutOfBoundsException("Error!! it is not Same.."); 
        }
    }
    public static void main(String[] args) {
        String str = "ram_pata";

        second obj = new second();

        
        obj.match(str, str.length()-1);


    }
}
