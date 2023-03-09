// Write an application that starts two threads. First thread displays even numbers in the range
// specified from the command line and second thread displays odd numbers in the same
// range. Each thread waits for 300 milliseconds before displaying the next numbers. The
// application waits for both the thread to finish and then displays the message “Both threads
// completed”.

package Unit4_Practicals;

class EvenNumber implements Runnable {
    int start, end;

    public EvenNumber(int start, int end) {
        this.start = start % 2 == 0 ? start : start + 1;
        this.end = end;
    }

    public void run() {
        System.out.println("\nEven Number :- ");
        for (int i = start; i < end; i += 2) {
            System.out.print(i);
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {

        }
    }

}

class OddNumber implements Runnable {

    int start, end;

    public OddNumber(int start, int end) {
        this.start = start % 2 == 0 ? start + 1 : start;
        this.end = end;
    }

    public void run() {
        System.out.println("\nOdd Number :- ");
        for (int i = start; i < end; i += 2) {
            System.out.print(i);
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {

        }
    }

}

public class first {

    public static void main(String[] args) {

        int start, end;
        start = Integer.parseInt(args[0]);
        ;
        end = Integer.parseInt(args[1]);

        Thread t1 = new Thread(new EvenNumber(start, end));
        Thread t2 = new Thread(new OddNumber(start, end));

        try {

            t1.start();
            t2.start();
            System.out.println("Executed...");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
