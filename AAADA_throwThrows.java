//throw and throws in exception

class negativedimensions extends Exception{
    public String toString(){
        return "dimensions of the rectangle cant be negative !😅";
    }
}
    

public class AAADA_throwThrows {
    
    static int meth1(int a , int b) throws negativedimensions
    {
        if(a<0 || b<0)
        throw new negativedimensions();
        int area  = (a*b);
        return area ;
    }

    static int meth2() throws negativedimensions
    {
       
        int a = meth1(-10,9);
        System.out.println(a);
        return a;

    }
    public static void main(String arg [])
    {
        try{
            meth2();
        }

        catch(negativedimensions e){
            System.out.println("error is : "+e);

        }
       
        
    }
}
