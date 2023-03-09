class A implements Runnable
{
    public void run()
    {
        System.out.println("child thread..");
    }
}
public class thread_runnable {
    
    public static void main(String[] args) {
        
        A obj = new A();
        Thread t = new Thread(obj);

        t.start();

    }

}
