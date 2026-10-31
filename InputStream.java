import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the First number : ");
        int a=Integer.parseInt(br.readLine());
        System.out.print("Enter the Second number : ");
        int b=Integer.parseInt(br.readLine());
        int sum=a+b;
        System.out.println("Addition : "+sum);
        br.close();
    }    
}
