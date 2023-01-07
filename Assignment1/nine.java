//Create a complex number class. The class should have a constructor and methods to add, subtract and multiply two complex numbers and to return the real and imaginary parts. 
package Assignment1;

class ComplexNumber{
    float img,real;

    ComplexNumber()
    {
        this.img = 0;
        this.real = 0;
    }
    ComplexNumber(float n1,float n2)
    {
        this.real = n1;
        this.img = n2;
    } 
    void display()
    {
        System.out.print("\n"+real+"i + "+img+"i");
    }
    ComplexNumber add(ComplexNumber c1)
    {
        ComplexNumber tmp = new ComplexNumber();
        tmp.real = real+c1.real;
        tmp.img = img+c1.img;
        return tmp;
    }
    ComplexNumber sub(ComplexNumber c1)
    {
        ComplexNumber tmp = new ComplexNumber();
        tmp.real = real-c1.real;
        tmp.img = img-c1.img;
        return tmp;
    }
    ComplexNumber mul(ComplexNumber c1)
    {
        ComplexNumber tmp = new ComplexNumber();
        tmp.real = real*c1.real;
        tmp.img = img*c1.img;
        return tmp;
    }
}

public class nine {
    

    public static void main(String[] args) {
        
    
    ComplexNumber obj1 = new ComplexNumber(12.2f,13.3f);
    ComplexNumber obj2 = new ComplexNumber(10f,11f);
    ComplexNumber obj3 = new ComplexNumber();

    //Addition
    obj3 =  obj1.add(obj2);
    obj3.display();

    //Subtraction
    obj3 = obj1.sub(obj2);
    obj3.display();


    //Multiplication
    obj3 = obj1.mul(obj2);
    obj3.display();

    }
}
