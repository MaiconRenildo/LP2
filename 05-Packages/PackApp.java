import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import figures.Rect;
import figures.Ellipse;
import figures.Circle;
class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1;
    Ellipse e1;
    Circle c1;
    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(350, 350);
        
        this.r1 = new Rect(210,50, 50,30,new Color(153, 255, 204),Color.red);

        this.e1 = new Ellipse(50,50, 50,30,Color.red,Color.green);
        
        this.c1 = new Circle(300,50,40,Color.green,Color.blue);
        
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
        this.c1.paint(g);
    }
}