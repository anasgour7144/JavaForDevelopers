import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization
{
    public static void main(String[] args) throws IOException
    {
        //Create Student class Object
        Student s1=new Student("Anas", 20, "anasgada142@gmail.com", 90);
        
        //Write data into file
        FileOutputStream fos=new FileOutputStream("obj2.txt");
        
        //Serialization
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        // how to serialize
        oos.writeObject(s1);
        oos.close();
        fos.close();

        System.out.println("File Created Succesfully");
    }
}