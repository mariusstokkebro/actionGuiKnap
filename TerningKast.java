import processing.core.PApplet;

public class TerningKast {
    int værdi;
    int sum;
    int minVærdi;
    int maxVærdi;
    PApplet p;
    TerningKast(PApplet p,int minVærdi, int maxVærdi){
        this.p = p;
        this.minVærdi = minVærdi;
        this. maxVærdi = maxVærdi;
    }
    void terningKast(){
      værdi = (int) p.random(minVærdi, maxVærdi);
        sum +=værdi;
    }

}
