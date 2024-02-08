import javax.swing.*;
import java.awt.*;

public class gui_test extends JFrame {

    //label that displays texts
    public gui_test()
    {
        //Title
        super("GUI Test");
        //Layout Type
        setLayout(new GridLayout(2,2));
        //Exits when closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Size
        setSize(500, 500);


        //Button
        JButton button = new JButton("Click me!");
        add(button);

        JLabel label = new JLabel("Example Text!");
        label.setAlignmentX(CENTER_ALIGNMENT);
        add(label);


        //visiblity
        setVisible(true);
    }

    public static void main(String[] args)
    {
        //creates the GUI
        gui_test myFrame = new gui_test();
    }
}