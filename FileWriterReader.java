import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileWriterReader 
{
    public static void main(String[] args) throws IOException
    {
        //File Writer
        FileWriter fw=new FileWriter("Test6.txt");
        String str="Java for Developers...Coding fun...";
        fw.write(str);
        System.out.println("File Created");
        fw.close();

        //File Reader
        FileReader fr=null;
        char arr[]=new char[512];
        try
        {
            fr=new FileReader("Test6.txt");
            fr.read(arr);
            System.out.println(new String(arr));
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            fr.close();
        }
    }    
}
