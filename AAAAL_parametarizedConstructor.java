class parent
{
    public parent()
    {
        System.out.println("non parametirized constructor");
    }

    public parent(int x)
    {
        System.out.println("parameterixed constructor");
    }
}

class child extends parent
{
    public child()
    {
        System.out.println("non parameterized child");
    }

    public child(int y)
    {
        System.out.println("parametrized child");
    }

    public child(int x, int y)
    {
        
        super(x);
        System.out.println("2nd parametirized constructor");
    }
}

public class AAAAL_parametarizedConstructor {
    
    public static void main(String [] arg)
    {
        child c = new child();

        System.out.println();
        child cd = new child(3);

        System.out.println();
        child ce= new child(3,4);
    }
}
