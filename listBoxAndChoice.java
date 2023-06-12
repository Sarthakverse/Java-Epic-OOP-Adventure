import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice ch;
    TextArea ta;

    public myframe()
    {
        super("listbox and choice");

        l=new List(4,true);
        ch=new Choice();
        ta=new TextArea(20,30);
        
        l.add("Monday");
        l.add("tuesday");
        l.add("wednesday");
        l.add("thursday");
        l.add("friday");
        l.add("saturday");
        l.add("sunday");

        ch.add("january");
        ch.add("february");
        ch.add("March");
        ch.add("April");
        

        setLayout(new FlowLayout());
        add(l);
        add(ch);
        add(ta);

        l.addItemListener(this);
        ch.addItemListener(this);
        l.addActionListener(this);


    }

    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource()==l)//hamne click listbox me kiya hai ya ni?...ye ye pata lagaega
            ta.setText(l.getSelectedItem()); 
        else
            ta.setText(ch.getSelectedItem());

    }

    public void actionPerformed(ActionEvent e) {
    String list[] = l.getSelectedItems();
        String txt="";
        for(String x:list)
        {
            txt = txt + x + "\n";
            ta.setText(txt);
        }  
}

     

public class listBoxAndChoice
{
    public static void main(String arg[])
    {
        myframe f=new myframe();
        f.setSize(400,400);
        f.setVisible(true);
    }
}




}