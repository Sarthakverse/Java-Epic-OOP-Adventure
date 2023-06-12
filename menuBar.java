import java.awt.*;
import java.awt.event.*;

class myframe extends Frame
{
    Menu file, sub;
    TextField tf;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    
    public myframe()
    {
       super("Menu Bar Demo");
        file = new Menu("File"); // Initialize 'file' menu
        sub = new Menu("Submenu"); // Initialize 'sub' menu
       
       open = new MenuItem("Open");
       save= new MenuItem("Save");
       close = new MenuItem("Close");
       closeall = new MenuItem("Closeall");

       auto = new CheckboxMenuItem("Auto Save");
       file.add(open);
       file.add(save);
       file.add(sub);
       file.add(auto);

       sub.add(close);
       sub.add(closeall);

       MenuBar mb = new MenuBar();
       mb.add(file);
       setMenuBar(mb);

    }
}

public class menuBar {
    public static void main(String arg[])
    {
        myframe f = new myframe();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
