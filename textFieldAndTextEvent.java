import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListener,TextListener
{

    Label l1,l2;
    TextField tf;

    public myframe()
    {
        super("poject");
        tf = new TextField(20);
        tf.setEchoChar('*');
        l1 =new Label("nothing is added yet");
        l2 = new Label("enter is not yet hit");
        tf.addTextListener(this);
        tf.addActionListener(this);
        setLayout(new FlowLayout());
        add(tf);
        add(l1);
        add(l2);


    }
    public void textValueChanged(TextEvent e) {
       l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent e) {
       l2.setText(tf.getText()); 
    }
    
}

public class textFieldAndTextEvent {
    public static void main(String arg[])
    {
        myframe f =new myframe();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
