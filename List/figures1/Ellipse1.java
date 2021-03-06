
package figures1;
import java.awt.*;

public class Ellipse1 {
    int x, y;
    int w, h;
    Color backgroundColor,borderColor;

    public Ellipse1 (int x, int y, int w, int h,Color border,Color background) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.backgroundColor = background;
        this.borderColor = border;
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(backgroundColor);
        g2d.fillOval(this.x,this.y, this.w,this.h);
        g2d.setColor(borderColor);
        g2d.drawOval(this.x,this.y, this.w,this.h);
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