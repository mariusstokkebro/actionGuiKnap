import processing.core.PApplet;

public class knap {
PApplet p;
float posX,posY,sizeX,sizeY;
String text;
action a;

    knap(PApplet p,float posX, float posY, String text,float sizeX,float sizeY){
        this.p = p;
        this.posX = posX;
        this.posY = posY;
        this.text = text;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    void display(){
        p.fill(100);
        p.rect(posX, posY, sizeX, sizeY);
        p.fill(250,100,100);
        p.text(text,posX+60,posY+20);

    }
    void click(float mouseX, float mouseY){
        if (p.mousePressed &&
                mouseX > posX &&
                mouseX < posX + sizeX &&
                mouseY > posY &&
                mouseY < posY + sizeY) {
            a.execute();
        }
    }
    void addAction(action a){
        this.a = a;
    }
}

