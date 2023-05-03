class circle
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
   
   public double circumfrence()
   {
      return perimeter();
   }
}

public class AAAAA_rectangle
{
   public static void main(String[] arg)
   {
     circle c1 = new circle();
	  c1.radius=4; // if u dont initialise it then u will get 0 as answers

     //can we create another object? for the same class...yes
     circle c2=new circle();
     c2.radius=5;
	  System.out.println("area : "+c1.area());
	  System.out.println("perimeter is : "+c1.perimeter());
	  System.out.println("circumference is : "+c1.circumfrence());

     System.out.println();
     System.out.println("area : "+c2.area());
	  System.out.println("perimeter is : "+c2.perimeter());
	  System.out.println("circumference is : "+c2.circumfrence());
   }
}