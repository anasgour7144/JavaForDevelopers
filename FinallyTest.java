public class FinallyTest 
{
    public static void main(String[] args) 
    {
        int a=12;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println("Division : "+c);
        }    
        catch(ArithmeticException e)
        {
            System.out.println("Exeption Caught : "+e);
        }
        finally
        {
            System.out.println("Finally block");
        }
        System.out.println("End of Program");
    }    
}
