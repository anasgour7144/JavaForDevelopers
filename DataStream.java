import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream 
{
    public static void main(String[] args) throws IOException
    {
        //Writeing data into file
        FileOutputStream fos=new FileOutputStream("Student.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Anas");
        dos.writeInt(20);
        dos.writeFloat(89.9f);
        dos.writeBoolean(true);
        System.out.println("Data Written Sucessfully");
        dos.close();

        //Reading data from file
        FileInputStream fis=new FileInputStream("Student.dat");
        DataInputStream dis=new DataInputStream(fis);
        String name=dis.readUTF();
        int age=dis.readInt();
        float marks=dis.readFloat();
        boolean result=dis.readBoolean();
        dis.close();

        //Show output
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
        System.out.println("Result : "+result);
    }    
}
