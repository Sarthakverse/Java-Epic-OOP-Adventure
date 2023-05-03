class A //SUPER CLASS
{
   public void display()
   {
      System.out.println("HELLO super class");
   }
}

class B //SUB class
{ 
    public void display() //this is overriding since u are redifining the display function again..
    {
        System.out.println("HEllo SUB class");
    }
}

public class AAAAM_methodOverriding {
     
    public static void main(String [] arg)
    {
        A sup = new A ();
        sup.display();
 
        System.out.println();

        B sub = new B();
        sub.display();  
    }
}
