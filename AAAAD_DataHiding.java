/*THE CODE WILL NOT COMPILE  
 * IT'S FOR KNOWLEDGE ONLY
*/

class datahiding
{
    private double length;
    private double width;

    public double area(){
        return length*width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double l){
        length = l;
    }

    
} 

public class AAAAD_DataHiding
{
    public static void main(String[] arg){
        datahiding s=new datahiding();

        //since length and width are hidden therefore u are getting error
        s.length = 5.0;
        s.width = 10.0;

       System.out.println(s.area()); 
       System.out.println( s.getLength()); 
       s.setLength(15.0); 
       System.out.println(s.area()); 
       
        
    }
    

}