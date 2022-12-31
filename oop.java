class info{
    String name;
    int age;

    public void print() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

public class oop {
    public static void main(String argv[]) {
        info i = new info();
        i.age = 18;
        i.name = "Ram_pata";

        i.print();
    }
    
}
