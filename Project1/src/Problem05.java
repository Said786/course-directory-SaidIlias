import processing.core.PApplet;

import javax.swing.*;

public class Problem05 extends PApplet {
    public void settings(){
        size(1080,720);

    }
    public void setup(){
        background(0);


        final float SIZE = 50;



        int row = Integer.parseInt(JOptionPane.showInputDialog("Insert the number of rows"));
        int columns = Integer.parseInt(JOptionPane.showInputDialog("Insert the number of columns"));

        float fieldWidth = columns * SIZE;
        float fieldHeight = row  * SIZE;
        float centeringShiftX = (width - fieldWidth) / 2;
        float centeringShiftY = (height - fieldWidth) / 2;

       for (int y = 0; y < row ; y++){
           for (int x = 0 ; x < columns; x++){
               float pixelX = centeringShiftX + x * SIZE;
               float pixelY = centeringShiftY + y * SIZE;
               fill((x + y) % 2 == 0 ? 200 : 10 );
               square( pixelX,pixelY,SIZE);
           }

       }// mousex, mouseY, undo the centering,


    }
    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}
