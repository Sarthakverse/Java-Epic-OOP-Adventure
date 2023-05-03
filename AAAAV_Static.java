class hondacity
{
    static long price = 10;
           int a , b ;
        
    static double onRoadPrice(String city)
    {
        switch(city)
        {
            case "delhi" : return price + price*0.1 ;
            case "mumbai" : return price + price*0.09 ;
            default : return 0.0 ;
        }
       
    }
}

public class AAAAV_Static {
    public static void main(String arg[])
    {
       // hondacity h1 = new hondacity();
       System.out.println(hondacity.onRoadPrice("delhi")); 

       // hondacity h2 = new hondacity();
        System.out.println(hondacity.onRoadPrice("mumbai"));
        
    }
}
