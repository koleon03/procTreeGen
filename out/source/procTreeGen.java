import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class procTreeGen extends PApplet {

public void setup() {
    
    background(0xff12e3d5);
    TreeGenerator treeGen = new TreeGenerator(250,500);
    treeGen.generateTree();
}

public void draw() {
    
}
class TreeGenerator{

    boolean treeDone = false;
    float startX;
    float startY;
    float thickness;
    float height;

    public TreeGenerator(float startX, float startY){
        this.startX = startX;
        this.startY = startY;
    }

    public void generateTree(){
        int i = 0;
        while(treeDone == false){
            if(i == 0){
               firstRect();
            }
        }
    }

    private void firstRect(){
        this.thickness = random(6, 30);
        this.height = random(8,50);
        quad(startX, startY, startX, startY + height, startX + thickness, startY + height, startX + thickness, startY);
    }

}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "procTreeGen" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
