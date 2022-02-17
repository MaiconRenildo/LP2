class Area {
    public static void main (String[] args) {
        new changeRectArea();
    }
}

class changeRectArea {
    Rect r1;
    changeRectArea () {
        this.r1 = new Rect(50,50, 100,30);
        int area = this.r1.area();
        System.out.format("Área inicial (%d).\n",area);
        this.r1.drag(2, 15);
        area = this.r1.area();
        System.out.format("Área final (%d).\n",area);
    }
}

class Rect {
    int x, y;
    int w, h;

    public Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int area() {
        return this.x*this.y;
    }

    public void drag(int dx,int dy){
        this.x=this.x+dx;
        this.y=this.y+dy;
    }
}


