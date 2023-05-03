class cylinder{
    public double radius;
    public double height;

    public double area(){
        return Math.PI*radius*radius*height;
    }

}




public class AAAAC_cylinder {
    public static void main(String [] arg)
    {
         cylinder s=new cylinder();
         s.radius=4.0;
         s.height=4.0;

         System.out.println("surface area is : "+s.area());
    }
}
