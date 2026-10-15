class Test
{
    int counter;
    Test()
    {
        counter=0;
    }
    void increment()
    {
        counter++;
    }
    int getMessage()
    {
        return counter;
    }
}
class ChildThread implements Runnable
{
    Thread t;
    Test obj;
    ChildThread(Test ob)
    {
        obj=ob;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=1000;i++)
        {
            synchronized(obj)
            {
                obj.increment();
            }
        }
    }
}
public class SynchronizedCounter 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started...");
        Test obj=new Test();
        ChildThread t1=new ChildThread(obj);
        ChildThread t2=new ChildThread(obj);
        ChildThread t3=new ChildThread(obj);
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Counter is : "+obj.getMessage());
        System.out.println("Main Thread Ended...");
    }    
}
