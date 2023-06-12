import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ItemListener
{

    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    public myframe()
    {
        super("radio butoons");
        cbg = new CheckboxGroup();
        l=new Label("nothing is selected");
        c1=new Checkbox("Male",false,cbg);
        c2=new Checkbox("Female",false,cbg);
        c3=new Checkbox("Transgender",false,cbg);

       c1.addItemListener(this);
       c2.addItemListener(this);
       c3.addItemListener(this);
       
        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if(c1.getState())
            str=str+" "+c1.getLabel();
        if(c2.getState())
            str=str+" "+c2.getLabel();
        if(c3.getState())
            str=str+" "+c3.getLabel();
        
        l.setText(str);
    }
    
}
public class radioButton {
    public static void main(String arg[])
    {
        myframe f=new myframe();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
