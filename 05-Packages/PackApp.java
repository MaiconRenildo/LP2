import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.Rect;
import figures.Ellipse;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1;
    Rect r2;
    Rect r3;
    Ellipse e1;
    Ellipse e2;
    Ellipse e3;
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
        this.r1 = new Rect(50,50, 50,50,Color.blue,Color.black);
        this.r2 = new Rect(110,50, 50,30,Color.black,Color.pink);
        this.r3 = new Rect(210,50, 50,30,new Color(153, 255, 204),Color.black);

        this.e1 = new Ellipse(50,300, 50,30,Color.red,Color.green);
        this.e2 = new Ellipse(110,300, 50,30,Color.pink,Color.green);
        this.e3 = new Ellipse(150,150, 100,30,Color.red,Color.green);
    }

    public void hi (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
  
        this.e2.paint(g);
        this.e1.paint(g);
        this.e3.paint(g);
    }
}