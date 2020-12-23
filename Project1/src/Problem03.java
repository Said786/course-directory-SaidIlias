import processing.core.PApplet;

import javax.swing.*;

public class Problem03 extends PApplet {
     public void settings(){
         size (1080, 720);

     }
     public void setup(){
         background(0);

         String message = JOptionPane.showInputDialog("Enter the first message: ");
         float number = Float.parseFloat(JOptionPane.showInputDialog("Enter the number: "));

         fill(30, 33, 98);
         textSize(88);
         textAlign(LEFT, CENTER);
         text(number, width / 2.0f, height / 2.5f);

         fill(255, 34, 200);
         textSize(100);
         textAlign(CENTER, CENTER);
         text(message, width / 2.0f, height / 2.0f);

         textSize(30);
         textAlign(RIGHT);
         text("and know I can ", 400, 250);


     }
    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}
