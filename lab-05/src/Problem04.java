import processing.core.PApplet;

public class Problem04 extends PApplet{
    public void settings (){
        size (720, 480);

    }
    public void setup(){
        background(0);
        noStroke();

        final int circle_count = 100;
        for (int i = 0; i < circle_count; i++){
            int x = (int)random( width);
            int y = (int) random(height);
            int size = (int)random(10, 20);


            int red = (int)random(256);
            int green = (int)random(256);
            int blue = (int)random(256);


            fill(red, blue, green);
            ellipse(x,y,size,size);


        }
    }
    public void draw (){

    }
    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}