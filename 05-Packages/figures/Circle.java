package figures;
import java.awt.*;
public class Circle {
  int x, y;
  int radius;
  Color backgroundColor,borderColor;

  public Circle (int x, int y, int radius,Color border,Color background) {
      this.x = x;
      this.y = y;
      this.radius = radius;
      
      this.backgroundColor = background;
      this.borderColor = border;
  }

  public void paint (Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      g2d.setColor(backgroundColor);
      g2d.fillOval(this.x,this.y, this.radius,this.radius);
      g2d.setColor(borderColor);
      g2d.drawOval(this.x,this.y, this.radius,this.radius);
  }

  public void drag(int dx,int dy){
      this.x=this.x+dx;
      this.y=this.y+dy;
  };

  public void changeColor(Color border,Color background){
      this.backgroundColor = background;
      this.borderColor = border;
  }
}
