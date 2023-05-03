class rectangle
{
    public double length;
    public double width;

    public double area()
    {
        return length * width;
    }

    public double perimeter()
    {
        return 2*(length+width);
    }

    public boolean isSquare()
    {
        if(length==width) return true;
        else return false;
    }

}

public class AAAAB_circle2
{
     public static void main(String [] arg)
     {
        rectangle r=new rectangle();

        r.length=10;
        r.width=20;

        System.out.println("area : "+ r.area());
        System.out.println("perimeter : "+ r.perimeter());
        System.out.println(r.isSquare());
    }   
}
