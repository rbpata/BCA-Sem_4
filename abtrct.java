// we can not create object of the Abstrct class
// we can use referencial object
// Any parent class is capable to store child class object

abstract class animal{

    animal(){
        System.out.println("animal class");
    }
}
class dog extends animal{
    dog(){
        System.out.println("dog class");
    }
}
public class abtrct {
    public static void main(String[] args) {
        
        // animal obj = new animal(); this is not allowed

        animal obj = new dog();
    }
}
