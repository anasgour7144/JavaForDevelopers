import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class BufferedStream 
{
    public static void main(String[] args) throws IOException
    {
        //Buffered Output Stream
        File fobj=new File("TextB.txt");
        FileOutputStream fos=new FileOutputStream(fobj);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String str="India is a Great Country";
        byte arr[]=str.getBytes();
        bos.write(arr);
        System.out.println("File Created...");
        bos.close();

        //Buffered Input Stream
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(fobj));
        byte barr[]=new byte[512];
        bis.read(barr);
        String str1=new String(barr);
        System.out.print(str1);
        bis.close();
    }    
}
