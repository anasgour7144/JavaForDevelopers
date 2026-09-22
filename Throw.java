public class Throw 
{
    public static void main(String[] args) 
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try
        {
            if(b!=0)
            {
                int c=a/b;
                System.out.println("Result : "+c);
            }
            else
                throw new ArithmeticException("Divide by zero...");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught : "+e.getMessage());
        }
        System.out.println("End of program...");
    }    
}
