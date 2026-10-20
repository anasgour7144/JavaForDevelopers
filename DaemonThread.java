class ChildThread implements Runnable
{
    Thread t;
    ChildThread()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("ChildThread : "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class DaemonThreadDemo implements Runnable
{
    Thread t;
    DaemonThreadDemo()
    {
        t=new Thread(this);
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("DaemonThread : "+i);
            try
            {
                Thread.sleep(4000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class DaemonThread 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started...");        
        ChildThread t1=new ChildThread();
        DaemonThreadDemo t2=new DaemonThreadDemo();
        t2.t.setDaemon(true);
        t2.t.start();
        System.out.println("isdaemon t1 : "+t1.t.isDaemon());
        System.out.println("isdaemon t2 : "+t2.t.isDaemon());
        System.out.println("Main Thread Ended...");
    }    
}
