import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {

        JFrame frame=new JFrame("New Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,300));
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton b1,b2,b3,b4,b5;
        b1=new NewButton("Button 01");
        b2=new NewButton("Button 02");
        b3=new NewButton("Button 03");
        b4=new NewButton("Button 04");
        b5=new NewButton("Button 05");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);



        frame.setVisible(true);
    }
}