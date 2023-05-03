class A
{
    public void start()
    {
        System.out.println("car A has started");
    }

    public void accelerate()
    {
        System.out.println("car A is accelerating");
    }

    public void changeGear()
    {
        System.out.println("gear of Car A has changed");
    }

}

class B extends A
{
    public void changeGear()
    {
        // method overriding
        System.out.println("gear of Car B has changed");
    }

    public void openRoof()
    {
        System.out.println("open roof of car B");
    }
}
public class AAAAN_method2Overriding {
    public static void main(String arg[])
    {
        A car = new B(); // statement would create an instance(or object )of  class B, which inherits all the properties 
        //and methods of class A in addition to its own. This is known as inheritance in object-oriented programming.
        car.start();
        car.accelerate();
        car.changeGear();

        System.out.println();

        B car2 = new B();
        car2.start();
        car2.accelerate();
        car2.changeGear();
        car2.openRoof();

    
    }
}
