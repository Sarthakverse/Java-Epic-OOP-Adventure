class a
{
   private static int x;
   private static int count = 0; 
   public int y = 30;
   
   public a(int value)
   {
       x=value;
       count= count+1;
   }

   public static void show()
   {
    System.out.println(count);
   }
}

public class Staticdataandfunctions {
    public static void main(String arg[])
    {
        a obj1=new a(10);
        System.out.println(obj1.y);
        a.show(); //calling static member of class a without creating obj
        a obj2=new a(20);
        a.show(); //calling static member of class a without creating obj
        a obj3=new a(30);
        a.show(); //calling static member of class a without creating obj
    }
}

