//Declare an abstract class Vehicle with an abstract method named numWheels().
//provide subclasses Car and Truck that each implements this method. Create 
//instance of these subclasses and demonstrate the use of this method

package Unit2_Practicals;

import java.util.Scanner;

abstract class Vehicle {

    abstract int numWheels();
}

class Car extends Vehicle {

    int numWheels() {
        return 4;
    }

}

class Truck extends Vehicle {

    int Wheels;

    int numWheels() {
        return 8;
    }
}

public class seven {
    public static void main(String[] args) {

        Car c1 = new Car();
        Truck t1 = new Truck();

        System.out.print("\nCar Wheels :- " + c1.numWheels());
        System.out.print("\nTruck Wheels :- " + t1.numWheels());

    }
}
