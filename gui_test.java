import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class gui_test extends JFrame {

    public gui_test() {
        //Title
        super("GUI Test");
        //Layout Type
        setLayout(new FlowLayout());
        //Button
        JButton button = new JButton("Click me!");
        //Adds button
        add(button);
        //Exits when closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Size
        setSize(300, 200);
        //visiblity
        setVisible(true);
    }

    public static void main(String[] args)
    {
        //creates the GUI
        gui_test myFrame = new gui_test();
    }
}