import exception.AgeException;
public class UDException
{
    public static void main(String[] args) 
    {
        int age=Integer.parseInt(args[0]);
        try
        {
            if(age<18)
            {
                throw new AgeException("You can't vote", new RuntimeException());
            }
            else
            {
                System.out.println("You can vote");
            }    
        }   
        catch(AgeException e)
        {
            System.out.println("Exception Caught : "+e.toString() +e.getCause());
        }
        System.out.println("Normal termination..."); 
    }
}