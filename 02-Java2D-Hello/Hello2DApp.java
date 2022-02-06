import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
  public static void main (String[] args) {
      Hello2DFrame frame = new Hello2DFrame();
      frame.setVisible(true);
  }
}

class Hello2DFrame extends JFrame{
  
  public Hello2DFrame () {

    this.addWindowListener (

        new WindowAdapter() {

            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }

        }
    );
    
    this.setTitle("Java2D - Hello World!");
    this.setSize(480, 480);
    this.setVisible(true);
  }

  public void paint (Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;

    // Pega os dados referentes ao tamanho da janela
    int w = this.getWidth();
    int h =this.getHeight();

    // Define os limites da tela
    int startY = 25;
    int startX = 1;
    int endX = w-2;
    int endY = h-2;
     
    // Define a cor de fundo da tela
    getContentPane().setBackground(new Color(41,41,163));

    // Desenha os quadrados
    g2d.setPaint(Color.BLACK);
    g2d.drawRect(((endX-startX)/2)-50, ((endY-startY)/2)+25,100,100);
    g2d.drawRect(((endX-startX)/2)-50, ((endY-startY)/2)-75,100,100);
    g2d.drawRect(((endX-startX)/2)-75, ((endY-startY)/2)-25,100,100);
    g2d.drawRect(((endX-startX)/2)-25, ((endY-startY)/2)-25,100,100);

    g2d.setPaint(Color.WHITE);

    // Desenha as linhas horizontais
    g2d.drawLine(startX, startY, endX, startY); 
    g2d.drawLine(startX,endY,endX,endY);
    // Desenha as linhas verticais
    g2d.drawLine(startX,endY,startX,startY);
    g2d.drawLine(endX,endY,endX,startY); 

    // Desenha o X
    g2d.setPaint(Color.WHITE);
    g2d.drawLine(startX, endY, endX, startY);
    g2d.drawLine(startX, startY, endX, endY);

    // Desenha os círculos
    int j = 25;
    int k = 0;
    int y = 50;
    for (int i = 0; i < 10; i++) {
      g2d.setPaint(new Color(j+25,j+25,j+25));
      int ovalOneX = ((endX-startX)/2)-j;
      int ovalOneY = ((endY-startY)/2)-k;
      g2d.drawOval(ovalOneX, ovalOneY, y, y);
      k = j;
      j=j+25;
      y=y+50;
    }
  }
}