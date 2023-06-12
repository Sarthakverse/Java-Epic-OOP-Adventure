/**@author SarthakRastogi 
* 
**/
import java.io.*;
// the program is for copying text from one file and pasting it 
// into other file in lowercase letters.

public class fileInputOutputStream {
    public static void main(String [] arg) throws Exception
    {
        try
        {
                FileInputStream fis = new FileInputStream("Source1.txt");
                FileOutputStream fos = new FileOutputStream("Source2.txt");
                //SequenceInputStream sis = new SequenceInputStream(fis1 , fis2);
                //FileOutputStream fos = new FileOutputStream("destination.txt") 
                int b;
                while((b=fis.read())!=-1)//reading
                {
                if(b>=65&&b<=120) fos.write(b+32);//copying
                else fos.write(b);//copying
                //fos.write(b);
                }

                fis.close();
                fos.close();
        }
        catch(Exception e)
        {
              System.out.println(e);
        }
        
    }
}
