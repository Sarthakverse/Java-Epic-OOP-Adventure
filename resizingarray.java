import java.util.Scanner;
public class resizingarray {
   public static void main(String arg[])
   {
      int array[]={1,2,3,4,5};
      int length = array.length;
     for(int i=0 ; i<array.length ; i++)
       {
          System.out.print(array[i]+" "); 
       }
     array =  resizearray(array);
      Scanner s=new Scanner(System.in);
      for(int i =length ; i<array.length ; i++)
      {
        System.out.print("array["+i+"] ");
        array[i]=s.nextInt();
      }



      for(int i =0 ; i<array.length ; i++)
      {
        System.out.print(array[i]+" ");
      }

   }
   
   public static int[] resizearray(int[] arr)
   {
       int newarr[]=new int[10];
       for(int i=0 ; i<arr.length ; i++)
       {
         newarr[i]=arr[i];
       }
       
       return newarr;
   }
}
