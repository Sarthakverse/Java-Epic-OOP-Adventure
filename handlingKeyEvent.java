import java.awt.*;
import java.awt.event.*;
import java.sql.Date;

class myframe extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;

    public myframe()
    {
        super("key event demo");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        l1.setBounds(30, 40, 100, 20);
        l2.setBounds(30, 60, 100, 20);
        l3.setBounds(30, 80, 100, 20);
        l4.setBounds(30, 100, 100, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);

    }

 
    public void keyTyped(KeyEvent e) {
        l3.setText("key typed");
        l4.setText(new Date(e.getWhen())+"");
    }

    
    public void keyPressed(KeyEvent e) {
        l1.setText("key pressed");
        l2.setText("");
    }

    
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
}

public class handlingKeyEvent {
    public static void main(String arg[])
    {
        myframe f = new myframe();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
