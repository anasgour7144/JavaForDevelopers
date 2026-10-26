import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class FileStreamReadWrite 
{
    public static void main(String[] args) throws IOException 
    {
        File fobj=new File("TextA.txt");
        FileOutputStream fos=new FileOutputStream(fobj);
        String str="Java For Developers....";
        byte arr[]=str.getBytes(); //convert string into byte 
        fos.write(arr); //add byte array in text file
        System.out.println("File Created");
        fos.close();

        FileInputStream fis=new FileInputStream(fobj);
        byte barr[]=new byte[512];
        fis.read(barr);
        String str1=new String(barr);
        System.out.print(str1);
        fis.close();
    }    
}
