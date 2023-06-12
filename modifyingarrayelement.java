public class modifyingarrayelement {
   public static void main(String arg[])
   {
      int arr[] = {1,2,3,4,5,6,7,8,9,10};
      modify(arr); //passing by refrence
      // modify(arr[i])....pass by value
      for(int i= 0; i<arr.length-1 ; i++)
      {
        System.out.print(arr[i]+" ");
      }
   } 

   static void modify(int [] m) 
   {
       for(int j= 0 ; j<m.length ; j++)
       {
          m[j] = m[j]+1;
       }
   }
}
