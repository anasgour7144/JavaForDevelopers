class Test
{
    int counter;
    boolean testFlag=false;
    synchronized void put(int ctr)
    {
        while(testFlag)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        counter=ctr;
        System.out.println("put() : "+counter);
        testFlag=true;
        notify();
    }
    synchronized void get()
    {
        while(!testFlag)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("get() : "+counter);
        testFlag=false;
        notify();
    }
}
class Producer implements Runnable
{
    Test obj;
    Thread t;
    Producer(Test ob)
    {
        obj=ob;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        int counter=1;
        for(int i=1;i<=25;i++)
        {
            obj.put(counter++);
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
class Consumer implements Runnable
{
    Test obj;
    Thread t;
    Consumer(Test ob)
    {
        obj=ob;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=25;i++)
        {
            obj.get();
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

public class InterThreadComm 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started...");
        Test obj=new Test();
        Producer p1=new Producer(obj);
        Consumer c1=new Consumer(obj);
        try
        {
            p1.t.join();
            c1.t.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Main Thread Ended...");
    }    
}
