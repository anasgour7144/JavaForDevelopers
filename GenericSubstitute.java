class Test
{
    Object s;
    void setValue(Object s)
    {
        this.s=s;
    }
    Object getValue()
    {
        return s;
    }
}
public class GenericSubstitute 
{
    public static void main(String[] args) 
    {
        Test t1=new Test();
        t1.setValue("Anas");
        String s=(String) t1.getValue();
        System.out.println("Name : "+s);
        t1.setValue(20);
        int i=(int) t1.getValue();
        System.out.println("Age : "+i);
    }    
}
