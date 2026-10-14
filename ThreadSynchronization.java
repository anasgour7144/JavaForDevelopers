class Test
{
    synchronized void printMsg(String message)
    {
        System.out.print("India is a "+message);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(" Country....");
    }
}
class ChildThread implements Runnable
{
    String message;
    Thread t;
    Test ob1;
    ChildThread(Test ob, String msg)
    {
        ob1=ob;
        message=msg;
        t=new Thread(this,message);
        t.start();
    }
    public void run()
    {
        ob1.printMsg(message);
    }
}
public class ThreadSynchronization 
{
    public static void main(String[] args) 
    {
        System.out.println("Mainthread Started...");
        Test ob1=new Test();
        ChildThread t1=new ChildThread(ob1,"Great");
        ChildThread t2=new ChildThread(ob1,"Honest");
        ChildThread t3=new ChildThread(ob1,"Religious");
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
        System.out.println("Mainthread Ended...");
     }    
}
