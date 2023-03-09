//Write a Java program to create 2 threads each thread calculates the sum and average of 1 to
//10 and 11 to 20 respectively. After all thread finish, main thread should print message “Task
//Completed”. Write this program with use of runnable interface.

package Unit4_Practicals;

class thread1 implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.print("\nSum of Thread 1 :- " + sum);
        int average = sum / 10;
        System.out.println("\nAverage of Thread 1 :- " + average);
    }
}

class thread2 implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 11; i <= 20; i++) {
            sum = sum + i;
        }
        System.out.print("\nSum of Thread 2 :- " + sum);
        int average = sum / 10;
        System.out.println("\nAverage of Thread 2 :- " + average);
    }
}

public class second {

    public static void main(String[] args) {

        Thread t1 = new Thread(new thread1());
        Thread t2 = new Thread(new thread2());

        try{

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("\nTask Completed...");

        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }

}
