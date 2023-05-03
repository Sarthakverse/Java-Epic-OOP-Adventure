

public class AAAEA_finallyblock {
    public static void main(String [] arg)
    {
        try{
            System.out.println(10/0);

            
        }
       /* catch(Exception e)
        {
            System.out.println(e);
        }*/ 
        finally{
            System.out.println("Final message");
        }
    }
}
