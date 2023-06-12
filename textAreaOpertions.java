import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListener
{
    Label l;
    TextArea ta;
    TextField tf;
    Button b;
    
    public myframe()
    {
        super("text_Area_Operations");
        l = new Label("nothing is written");
        ta = new TextArea(20,30);
        tf = new TextField(20);
        b = new Button("Click");
        
        b.addActionListener(this);
       

        setLayout(new FlowLayout());

        add(l);
        add(ta);
        add(b);
        add(tf);
    }

    public void actionPerformed(ActionEvent e)
    {
        // l.setText(ta.getSelectedText());
        //l.setText(ta.getText());
        ta.insert(tf.getText(),ta.getCaretPosition());
    } 
  
   
}  

public class textAreaOpertions {
    public static void main(String arg[])
    {
        myframe f=new myframe();
        f.setSize(800,800);
        f.setVisible(true);
    }
}



