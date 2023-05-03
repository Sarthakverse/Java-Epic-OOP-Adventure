import java.util.*;

public class AAABA_exceptionHandllin {
    public static void main(String arg[])
    {
        int arr[] = {100,10,5,2,3};
        System.out.println("enter 1st index and 2nd index : ");
        Scanner s = new Scanner(System.in);
       try{
        int x = s.nextInt();
        int y = s.nextInt();

        int c = arr[x]/arr[y];

        System.out.println(c);
       } 
       catch(ArithmeticException e)
       {
          System.out.print("arith mistake");
       }
       catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array bounds exception");
        }

    }
}
