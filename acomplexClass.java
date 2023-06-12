
import java.util.*;

class complex
{
    private float real, imag;

    public complex()
    {
    }

    public complex(float r , float i)
    {
        real = r;
        imag = i;
    } 

    public void getData()
    {
        float r ,i ;
        Scanner s = new Scanner(System.in);
        System.out.println("enter real and imaginary part: ");
        r = s.nextFloat();
        i = s.nextFloat();

        real = r;
        imag = i;
    }

    public void setData(float r, float i)
    {
        real = r;
        imag = i;
    }

    public void displayData()
    {
        System.out.println("real = "+real);
        System.out.println("imag = "+imag);
    }

    public complex addcomplex(complex y)
    {
        complex t = new complex();
        t.real = real * y.real - imag * y.imag;
        t.imag = real * y.imag + y.real * imag;  
        return t;
    }

}

public class acomplexClass {
    public static void main(String arg[])
    {
        complex c1, c2, c3 ;
        c1 = new complex();
        c1.setData(2.0f,2.0f);
        c2 = new complex();
        c3 = new complex();

        c3= c1.addcomplex(c2);
        System.out.println("Complex c3");
        c3.displayData();
    }
}
