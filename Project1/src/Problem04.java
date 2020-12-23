import processing.core.PApplet;

public class Problem04 extends PApplet {
    float initialAngel = 0.0f;
    float deltaAngel = 0.01f;
    public void settings(){
        size (1080, 720);
    }
    public void setup (){
        background(0);
        strokeWeight(3);

    }
    public void draw(){
        background(0);


        float x = width * 0.5f;
        float y = height * 0.5f;

        stroke(255, 0, 0);
        star1(8, x, y , 70.0f, 200.0f, initialAngel );
        initialAngel += deltaAngel;


    }
    private void star1 (int rays, float x, float y, float radius1, float radius2, float angel){
        float angelStep = TWO_PI / rays;

        float prevEndX = x + cos(angel - angelStep) * radius1;
        float prevEndY = y + sin(angel - angelStep) * radius1;

        for (int i = 0; i < rays ; ++i){
            float radius = i % 2 == 0 ? radius2 : radius1;
            float endX  = x + cos(angel) * radius;
            float endY = y + sin(angel) * radius;

            line(x,y,endX,endY);
            line(prevEndX,prevEndY,endX,endY);

            angel += angelStep;
            prevEndX = endX;
            prevEndY = endY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
