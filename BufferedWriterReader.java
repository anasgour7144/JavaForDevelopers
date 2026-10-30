import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedWriterReader 
{
    public static void main(String[] args) throws IOException
    {
        //Buffered writer
        BufferedWriter bw=new BufferedWriter(new FileWriter("ABC.txt"));
        String str="ABC is a alphabet of english language";
        bw.write(str);
        System.out.println("File Copied..");
        bw.close();

        //Buffered Reader
        BufferedReader br=new BufferedReader(new FileReader("Test6.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
        br.close();
    }    
}
