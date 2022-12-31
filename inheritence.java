class A{
    public void show() {
        System.out.println("class A");
    }
}
class B extends A{

}

public class inheritence {
    public static void main(String argv[]) {
        B obj = new B();
        obj.show();
    }

}
