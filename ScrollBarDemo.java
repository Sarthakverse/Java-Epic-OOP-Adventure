import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;

    public myframe()
    {
        super("scrollbar demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,2,20,0,255); 
        blue = new Scrollbar(Scrollbar.HORIZONTAL,2,20,0,255);
        
        tf=new TextField();

        tf.setBounds(50, 50, 300, 50);
        red.setBounds(50, 150, 300, 30);
        blue.setBounds(50, 200, 300, 30);
        green.setBounds(50, 250, 300, 30);

        setLayout(null);
        add(tf);
        add(red);
        add(blue);
        add(green);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

    }
    public void adjustmentValueChanged(AdjustmentEvent e) {
      tf.setBackground(new Color(red.getValue(), blue.getValue(), green.getValue())); 

    }
}

public class ScrollBarDemo {
    public static void main(String arg[])
    {
        myframe f=new myframe();
        f.setSize(800,800);
        f.setVisible(true);
    }
}
