class TestFinally
{
    void test1(int x) throws IllegalAccessException
    {
        try
        {
            System.out.println("Test 1 method : "+x);
            throw new IllegalAccessException("Illegal Acces Exception ");//es line se pahle finally block chalega hamesha kyunki finally ki 
        }                                                                     //  priority jyada hoti hai exception se pahle fnally chalega 
        finally
        {
            System.out.println("Finally block method1....");
        }
    }
    void test2(int x)
    {
        try
        {
            System.out.println("Test 2 method : "+x);
            return;
        }
        finally
        {
            System.out.println("Finally block method2....");
        }
    }
}
public class FinallyByMethod 
{
    public static void main(String[] args) 
    {
        TestFinally obj=new TestFinally();
        try
        {
            obj.test1(44);
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Exception Caught : "+e);
        }
        obj.test2(777);
        System.out.println("End of Program ");
    }    
}
