class a extends Thread
{
    public void run()//@Override 
    // public void fun()
    {
        try
{        for(int i=0;i<5;i++)
        {
            System.out.println("Ram");
            Thread.sleep(1000);
        }
    }catch(InterruptedException e)
    {

    }
    }
}

class thread {
    
public static void main(String[] args) {
    
       a obj = new a();
       obj.start();
       //obj.Fun();
    for(int i=0;i<5;i++)
    System.out.println("Pata");
}

}
