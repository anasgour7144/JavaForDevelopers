import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy 
{
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Anas.jpeg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("Anascopy.jpeg"));
        int ch;
        while((ch=bis.read())!=-1)
        {
            bos.write(ch);
        }
        System.out.println("File Copied");
        bis.close();
        bos.close();
    }    
}
