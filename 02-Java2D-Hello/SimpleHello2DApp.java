import java.awt.*;
import javax.swing.*;

public class SimpleHello2DApp {
  public static void main (String[] args) {
      Hello2DFrame frame = new Hello2DFrame();
      frame.setVisible(true);
  }
}


class Hello2DFrame extends JFrame{
  
  //construtor
  public Hello2DFrame(){
    this.setTitle("Hello World");
    this.setSize(350,350);

  };

  // g é o contexto gráfico
  public void paint (Graphics g){

    //chama o método paint da superclasse(Jframe)
    super.paint(g);

    //Converte do tipo Graphics para Graphics2D
    Graphics2D g2d = (Graphics2D) g;

    g2d.setPaint(Color.blue);
    int w = this.getWidth();
    int h =this.getHeight();
    g2d.drawLine(0, 0, w, h);
    g2d.drawLine(0, h, w, 0);
    
  }
}