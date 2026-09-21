public class MultipleExceptions 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[5];
        int j=0;
        for(int i = 0; i < args.length; i++)
        {
            try
            {
                arr[j] = Integer.parseInt(args[i]);
                j++;
            }
            catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception : " + e);
            }
        }
        System.out.println("Array Element : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }    
}