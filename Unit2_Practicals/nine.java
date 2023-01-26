// Create class calculation with an abstract method area( ). Create Rectangle and 
// Triangle subclasses of calculation and find area of rectangle and triangle.
package Unit2_Practicals;

abstract class Calculation{

    abstract void Area();
}
class Triangle extends Calculation{

    int b,h;
    void setData(int b,int h)
    {
        this.b = b;
        this.h = h;
    } 
    void Area()
    {
        System.out.print("\nArea Of A Triangle :- "+(0.5*b*h));
    }

}
class Rectangle extends Calculation{
    int l,w;
    void setData(int l,int w)
    {
        this.l = l;
        this.w = w;
    } 
    void Area()
    {
        System.out.print("\nArea Of A Rectangle :- "+(l*w));
    }
}
public class nine {
    public static void main(String[] args) {
        
        System.out.println("\n-----------------------------------------------");
        Triangle t1 = new Triangle();
        t1.setData(5, 3);
        t1.Area();

        System.out.println();

        Rectangle r1 = new Rectangle();
        r1.setData(8, 4);
        r1.Area();
        System.out.println("\n\n-----------------------------------------------");

    }
}
