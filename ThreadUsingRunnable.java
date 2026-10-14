class ChildThreadOne implements Runnable
{
    ChildThreadOne()
    {
        Thread t1=new Thread(this);
        t1.start();
    }
    public void run()
    {
        System.out.println("ChildThreadOne Started...");
        try
        {
            for(int i=0;i<=10;i++)
            {
                System.out.println("ChildThreadOne : "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("ChildThreadOne Ended...");
    }
}
class ChildThreadTwo implements Runnable
{
    public void run()
    {
        System.out.println("ChildThreadTwo Started...");
        try
        {
            for(int i=0;i<=10;i++)
            {
                System.out.println("ChildThreadTwo : "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("ChildThreadTwo Ended...");
    }
}

public class ThreadUsingRunnable 
{
    public static void main(String[] args) 
    {
        System.out.println("MainThread Started...");
        new ChildThreadOne();
        ChildThreadTwo obj=new ChildThreadTwo();
        Thread t2=new Thread(obj);
        t2.start();
        System.out.println("MainThread Ended...");
    }    
}
