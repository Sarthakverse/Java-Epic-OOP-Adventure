import java.awt.*;

class myframe extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public myframe()
    {
        super("My app");
        setLayout(new FlowLayout());

        l=new Label("name: ");
        tf = new TextField(20);
        b = new Button("Ok");  

        add(l);
        add(tf);
        add(b);
    }


}
public class firstAppMethod2 {
    public static void main(String arg[])
    {
        myframe f=new myframe();
        f.setSize(500,500);
        f.setVisible(true);

    }
}
