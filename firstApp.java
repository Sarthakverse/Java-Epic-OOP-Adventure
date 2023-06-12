import java.awt.*;
public class firstApp {
    public static void main(String arg[])
    {
        Frame f=new Frame("My first app");
        f.setLayout(new FlowLayout()); // this will reduce size of ok button window
        f.setSize(500,500); // size of frame
        f.setVisible(true); //showing the frame on screen
        
        Button b = new Button("Ok"); // to add button u need f.add compulsorily
        Label l=new Label("Name:"); // to add button u need f.add compulsorily
        TextField tf=new TextField(20);// to add button u need f.add compulsorily

        f.add(l);
        f.add(tf);
        f.add(b); // however this will create the size of button to be equal to the size of frame.
        // so you will have to set flow layout....see line 6

       
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
