import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import figures1.Ellipse1;
import figures1.Rect1;
import java.util.ArrayList;

class ListApp {
    public static void main (String[] args) {
        EllipseFrame frame = new EllipseFrame();
        frame.setVisible(true);
    }
}

class EllipseFrame extends JFrame {

    int w,h;
    ArrayList <Ellipse1> ellipses = new ArrayList<Ellipse1>();
    ArrayList <Rect1> rects = new ArrayList<Rect1>();
    EllipseFrame () {

        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.setTitle("Java Packages");
        this.setSize(480, 480);
        getContentPane().setBackground(Color.black);

        this.addKeyListener(new KeyAdapter(){

          public void keyPressed(KeyEvent key){

            Random r =  new Random();
            int xPosition = r.nextInt(w)+1;
            int yPositon = r.nextInt(h)+25;
            int width = r.nextInt(w);
            int height = r.nextInt(400);

            if(key.getKeyChar() == 'e'){
              ellipses.add(new Ellipse1(xPosition,yPositon, width,height,Color.blue,Color.white));
              repaint();
            }

            if(key.getKeyChar()=='r'){
              rects.add(new Rect1(xPosition,yPositon, width,height,Color.blue,Color.white));
              repaint();
            }
            
          }

        });
    }

    public void paint(Graphics g){
      super.paint(g);
      this.getScreenLimits();
      for(Ellipse1 c: this.ellipses){
        c.paint(g);
      };

      for(Rect1 a : this.rects){
        a.paint(g);
      }
    }

    public void getScreenLimits(){
      w = this.getWidth();
      h =this.getHeight();
    };
}