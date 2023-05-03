class parent
{
    public parent()
    {
        System.out.println("parent class");
    }
}

class child extends parent
{
   public child()
   {
      System.out.println("child class");
   }
}

class grandchild extends child
{
    public grandchild()
    {
        System.out.println("grandchild class");
    }
}

public class AAAAK_constructorInheritance
{
    public static void main(String [] arg)
    {
        parent p = new parent();
        System.out.println();

        child c = new child();
        System.out.println();

        grandchild gc = new grandchild();
        System.out.println();
    }
}