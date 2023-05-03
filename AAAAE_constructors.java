class rectangle
{
    private double length;
    private double width;

    //constructor doesn't have return type and have name same as class name..
    public rectangle(double l,double b)
    {
        length = l ;
        width = b ;
        
    }
    public rectangle()
    {
        length=5.0 ;
        width = 5.0;
    }

    public double area()
    {
        return length*width;
    }
}

public class AAAAE_constructors {
    public static void main(String [] args)
    {
        rectangle s1 = new rectangle(3,5); // passing arguments
        rectangle s2 = new rectangle();// without passing arguments
        
        System.out.println("area on passing arguments is : "+s1.area()); //15.0
        System.out.println("area without passing arguments is : "+s2.area()); //25.0
    }
}
