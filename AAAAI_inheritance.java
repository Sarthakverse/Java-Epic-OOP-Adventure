// inheritance

class cylinder
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
     public double circumference()
     {
        return perimeter();
     }
}

class volume extends cylinder
{
    public double height;
    public double vol()
    {
        return area()*height;
    }
}

public class AAAAI_inheritance
{
    public static void main(String [] arg)
    {
        volume v = new volume();
        v.radius=10.0;
        v.height=20.0;

        System.out.println("volume is : "+v.vol());

    }
}
