import processing.core.PApplet;
public class Problem03 extends PApplet {
    public void settings(){
        size(1280, 900);
    }
    public void setup(){
        background(0);

        strokeWeight(3);


        stroke(255,0,0);
        star(8, width *0.5f, height * 0.5f, 70.0f, 200.0f, 0.0f);
        stroke(255,255,0);
        star(8, width *0.5f + 250, height * 0.5f + 250, 30.0f, 100.0f, 0.0f);
        stroke(255,255,0);
        star(8, width *0.5f - 250, height * 0.5f + 250, 30.0f, 100.0f, 0.0f);
        stroke(255,255,0);
        star(8, width *0.5f + 250, height * 0.5f - 250, 30.0f, 100.0f, 0.0f);
        stroke(255,255,0);
        star(8, width *0.5f - 250, height * 0.5f -250, 30.0f, 100.0f, 0.0f);


    }
    void star (int rayCount, float x, float y , float radius1, float radius2, float angel ){


        float angelStep = TWO_PI / rayCount;

        float prevEndX =  x + cos(angel - angelStep) * radius1;
        float prevEndY = y + sin(angel - angelStep) * radius1;

        for (int i = 0; i < rayCount; i++){
            float selectedRadius = i % 2 == 0 ? radius2 : radius1;
            float endX = x + cos(angel) * selectedRadius;
            float endY = y + sin(angel) * selectedRadius;
            line(x, y, endX, endY);
            line(prevEndX, prevEndY, endX, endY);

            angel += angelStep;
            prevEndX = endX;
            prevEndY = endY;


        }


    }

    public static void main(String[] args){
        PApplet.main("Problem03");
    }

}
