// Create two thread. One thread print “fybca” 4 times and another thread print “sybca” 6
// times. Set priority for both thread and when thread finished print “tybca” from main.

package Unit4_Practicals;

class fybca implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.print("\nfybca");
        }
    } 
}

class sybca implements Runnable
{
    public void run()
    {
        for(int i=0;i<6;i++)
        {
            System.out.print("\nSybca");
        }
    } 
}

public class third {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new fybca());
        Thread t2 = new Thread(new sybca());
        

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        try
        {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("\ntybca");
    }

}
