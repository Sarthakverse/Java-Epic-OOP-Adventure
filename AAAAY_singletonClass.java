class cofeemachine
{
   private float cofeeqty;
   private float milkqty;
   private float waterqty;
   private float sugarqty;
   
   static private cofeemachine my = null ;

   private cofeemachine()
    {
        cofeeqty = 1 ;
        milkqty = 1 ;
        waterqty = 1 ;
        sugarqty = 1 ;
   }

   public void fillwater(float qty)
   {
      waterqty = qty ;
   }
   public void fillsugar(float qty)
   {
      sugarqty = qty;
   }
   public float getcofee()
   {
     return 1.23f; 
   }

   static cofeemachine getInstance()
   {
     if (my == null)
      my=new cofeemachine();

      return my ; 
   }
}

public class AAAAY_singletonClass {
    public static void main(String arg[])
    {
       cofeemachine m1 = cofeemachine.getInstance(); 
       cofeemachine m2 = cofeemachine.getInstance();
       cofeemachine m3 = cofeemachine.getInstance();

       System.out.println(m1+" "+m2+" "+m3);

       if(m1==m2 && m1==m3)
       {
         System.out.println("same");
       }
    }
}
