class cylinder
{
     public double radius;
     public double height;

     public double getRadius()
     {
        return radius;
     }
     public double getHeight()
     {
        return height;
     }

     public void setRadius(double r)
     {
        radius = r;
     }    
     public void setHeight(double h)
     {
        height = h;
     }

     public double area()
     {
      return  Math.PI * radius * radius * height ;
     }

     public cylinder()
     {
      radius=1;
      height=1;
     }
     public cylinder(double x, double y)
     {
       radius = x;
       height = y;
     }

}

public class AAAAF_cylinderConstructor {
    public static void main(String [] arg)
    {
        cylinder  s = new cylinder();
        
        System.out.println("radius : "+s.radius);
        System.out.println("height : "+s.height);
        System.out.println("area : "+s.area());
        
        System.out.println();
        
        s.setRadius(10.0);
        s.setHeight(20.0);
        System.out.println("radius : "+s.radius);
        System.out.println("height : "+s.height);
        System.out.println("area : "+s.area());
        
        System.out.println();

        cylinder s2 = new cylinder(2,5);
        System.out.println("radius : "+s.radius);
        System.out.println("height : "+s.height);
        System.out.println("area : "+s.area());
    }
}
