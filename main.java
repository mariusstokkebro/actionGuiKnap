import processing.core.PApplet;

public class main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("main");
    }

    knap buttonTerning6 = new knap(this, 10, 10, "Slå med 6s terning!", 150, 50);
    knap buttonTerning10 = new knap(this, 340, 10, "Slå med 10s terning!", 150, 50);
    knap buttonTerning15 = new knap(this, 180, 10, "Slå med 15s terning!", 150, 50);




    int sum;
    int terningeKast;

    @Override
    public void settings() {
        super.settings();
        size(500, 500);
    }

    @Override
    public void setup() {


        buttonTerning6.addAction(new action() {

                                     public void execute() {
                                         terningeKast = (int) random(1, 7);
                                         sum += terningeKast;
                                     }
                                 }
        );

        buttonTerning10.addAction(new action() {
                                      public void execute() {
                                          terningeKast = (int) random(1, 11);
                                          sum += terningeKast;

                                      }
                                  }
        );
        buttonTerning15.addAction(new action() {
                                      public void execute() {
                                          terningeKast = (int) random(1, 16);
                                          sum += terningeKast;
                                      }
                                  }
        );
    }

    public void draw() {
        clear();
        buttonTerning6.display();
        buttonTerning10.display();
        buttonTerning15.display();
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width / 2, 200);
        text("Samlet sum    " + sum, width / 2, 250);

    }


    @Override
    public void mousePressed() {
        buttonTerning6.click(mouseX, mouseY);
        buttonTerning10.click(mouseX, mouseY);
        buttonTerning15.click(mouseX,mouseY);
    }
}
