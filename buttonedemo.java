import java.awt.*;
import java.awt.event.*;
class myFrame extends Frame implements ActionListener
{
    int count = 0;
    Label l;
    Button b;

    public myFrame()
    {
        super("button demo");
        l = new Label("   "+count);
        b = new Button("click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
        

    }
    public void actionPerformed(ActionEvent e) 
    {
        count++;
        l.setText("   "+count);
    }
}

public class buttonedemo {
   public static void main(String arg [])
   {
       myFrame f=new myFrame();
       f.setSize(400,400);
       f.setVisible(true);
   } 
}
