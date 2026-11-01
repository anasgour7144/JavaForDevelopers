import java.io.IOException;
//import java.io.Console;
import java.io.PrintWriter;
import java.io.PrintStream;
public class ConsoleIOTest
{
    public static void main(String[] args) throws IOException
     {
    //     Console cn=System.console();
    //     System.out.print("Enter the name : ");
    //     String name=cn.readLine();
    //     System.out.println("Your name : "+name);

    //     //password hidden 
    //     char password[]=cn.readPassword("Enter password");
    //     String str=new String(password);
    //     System.out.println("your password : "+str);

        PrintWriter pw=new PrintWriter(System.out);
        pw.println("Anas Gour");
        pw.close();

        PrintStream ps=new PrintStream(System.out);
        ps.println("Sana Gour");
        ps.close();
    }    
}
