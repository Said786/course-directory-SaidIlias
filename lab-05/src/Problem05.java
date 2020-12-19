import processing.core.PApplet;

import java.util.Random;

public class Problem05 extends PApplet {
    public void settings(){
        size(1080,720);
    }
    public void setup(){
        background(0);

        int r ;
        int x = (int) (width * 0.5f);
        int y = (int) (height * 0.5f);

        int SIZE = 600;

        for (r = 1; r <= 255; r += 17){

            noStroke();

            fill (r, 10, 10);
            circle(x, y, SIZE);
            SIZE -= 25;
        }



    }
    public void draw(){

    }
    public static void main(String[] args) {
PApplet.main("Problem05");
    }

}
