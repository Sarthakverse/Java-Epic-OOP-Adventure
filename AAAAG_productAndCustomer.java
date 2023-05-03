class product
{
   public String itemno;
   public String name;
   public double price;
   public int quan;

   public void setItemno(String s)
   {
       itemno = s ;
   }

   public void setName(String x)
   {
       name= x ;
   }

   
   public double getPrice()
   {
      return price;
   } 

   public double getQuan()
   {
      return quan;
   }

   public product()
   {
      itemno = "0" ;
      name = "0" ;
      price = 0 ;
      quan  = 0 ;
   }

   public product(String x, String y, double z ,int q)
    {
        itemno = x;
        name = y;
        price = z;
        quan = q;
    }

}

public class AAAAG_productAndCustomer {
    public static void main(String [] arg)
    {
        product s = new product();
         
        System.out.println("item no : "+s.itemno);
        System.out.println("name : "+s.name);
        System.out.println("price : "+s.price);
        System.out.println("quantity : "+s.quan);

        product s2 = new product("Az21","Sarthak rastogi",2300.0,5);
        System.out.println();
         
        System.out.println("item no : "+s2.itemno);
        System.out.println("name : "+s2.name);
        System.out.println("price : "+s2.price);
        System.out.println("quantity : "+s2.quan);

        System.out.println();

        s.setItemno("AAZ");
        s.setName("ankur kumar");
        System.out.println("item no : "+s.itemno);
        System.out.println("name : "+s.name);
        System.out.println("price : "+s.price);
        System.out.println("quantity : "+s.quan);

    }
}
