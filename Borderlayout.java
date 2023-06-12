import java.awt.*;
import java.awt.event.*;

class myframe extends Frame 
{
    Button b1,b2,b3,b4,b5;

    public myframe()
    {
        super("Border Layout");
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);
        
        Panel p =new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("mon"));
        p.add(new Button("tue"));
        p.add(new Button("wed"));
       add(p,BorderLayout.EAST);
    }
}

public class Borderlayout
{
public static void main(String arg [])
   {
       myframe f=new myframe();
       f.setSize(400,400);
       f.setVisible(true);
   } 
    

}

