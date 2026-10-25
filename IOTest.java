import java.io.File;
import java.io.IOException;
public class IOTest 
{
    public static void main(String[] args) throws IOException 
    {
        File fobj=new File("Stud.txt");
        System.out.println("File Name : "+fobj.getName());
        System.out.println("File Path : "+fobj.getPath());
        System.out.println("File Absolute Path : "+fobj.getAbsolutePath());
        System.out.println("Can Read : "+fobj.canRead());
        System.out.println("length : "+fobj.length());
    }    
}
