import java.awt.*;

public class CircleApp {
  public static void main (String[] args) {
    Rect r1= new Rect(1,1,2,Color.black,Color.blue,false);
    r1.print();
  }
}

class Rect{
  int centerX,centerY,radius;
  Color backGroundColor,borderColor;
  boolean focus;

  Rect(int centerX,int centerY,int radius,Color backGroundColor,Color borderColor,boolean focus){
    this.centerX = centerX;
    this.centerY = centerY;
    this.focus = focus;
    this.radius = radius;
    this.backGroundColor = backGroundColor;
    this.borderColor = borderColor;
  }
  
  void print(){
    System.out.format("Propriedades do círculo:\n");
    System.out.format("Circulo centralizado no ponto (%d,%d) e de raio (%d).\n",this.centerX,this.centerY,this.radius);
    System.out.format("Cor da borda: %s\n",this.borderColor);
    System.out.format("Cor de fundo: %s\n",this.backGroundColor);
  }
}