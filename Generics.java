//Generics
class Box<T> //type parameter
{
    private T value;
    Box(T value)
    {
        this.value=value;
    }
    void setValue(T value)
    {
        this.value=value;
    }
    T getValue()
    {
        return this.value;
    }
}
// Generics Pairs
class Boss<T,U>
{
    T value1;
    U value2;
    Boss(T value1,U value2)
    {
        this.value1=value1;
        this.value2=value2;
    }

}
public class Generics 
{
    public static void main(String[] args) 
    {
        Box<Integer> b1=new Box<>(2); //type argument
        System.out.println(b1.getValue());

        Boss<String,Integer> b2=new Boss<>("Anas", 22);
        System.out.println("Name : "+b2.value1+" , "+"age : "+b2.value2);
    }    
}
