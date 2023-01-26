// The abstract Vegetable class has four subclasses named cabbage, carrot and 
// potato. Write an application that demonstrates how to establish this class 
// hierarchy. Declare one instance variable of type string that indicates the color of 
// a vegetable. Create and display instances of these object. Override the toString() 
// method of object to return a string with the name of the vegetable and its color.

package Unit2_Practicals;

abstract class Vegetable {
    String color;
    public abstract String toString();
}

class Cabbage extends Vegetable {

    public String toString() {
        return "Cabbage :- " + color;
    }
}

class Carrot extends Vegetable {
    public String toString() {
        return "Carrot :- " + color;
    }
}

class Potato extends Vegetable {
    public String toString() {
        return "Potato :- " + color;
    }
} 

public class ten {
    public static void main(String[] args) {
        Vegetable cabbage = new Cabbage();
        Vegetable carrot = new Carrot();
        Vegetable potato = new Potato();
       
        cabbage.color = "Green";
        carrot.color = "Orange";
        potato.color = "Brown";
       
       System.out.println("\n----------------------------------------------------------");
        System.out.println(cabbage.toString());
        System.out.println(carrot.toString());
        System.out.println(potato.toString());
        System.out.println("----------------------------------------------------------");
    }
}
