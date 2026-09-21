public class Validateint 
{
    public static void main(String[] args) 
    {
        int valid=0;
        int invalid=0;
        for(int i=0;i<args.length;i++)
        {
            try
            {
                int x=Integer.parseInt(args[i]);
                System.out.println("Integer : "+x);
                valid++;
            }
            catch(NumberFormatException e)
            {
                invalid++;
                System.out.println("Not a Integer : "+args[i]);
            }
        }
        System.out.println("Total Integer : "+valid);
        System.out.println("Total non-integer : "+invalid);
    }    
}
