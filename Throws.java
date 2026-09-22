public class Throws 
{
    public static void main(String[] args) 
    {
        try
        {
            printState();
        }    
        catch(InterruptedException e)
        {
            System.out.println("Eception Caught : "+e);
        }
    }    
    public static void printState() throws InterruptedException
    {
        throw new InterruptedException();
    }
}
