/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * Sun.java */

import java.awt.*; // use graphics

public class Sun extends Sprite {
  
  //instance variables
  private int centerX;
  private int centerY;
  private int radius;
  private int deltaY;
  
  // constructor
  public Sun (int tempDelta) {
    centerX = width/2;
    centerY = height;
    radius = width/4;
    deltaY = tempDelta;
  }
  
  //The sun is just a giant yellow circle.
  public void drawState(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(centerX - radius, centerY - radius, 2*radius, 2*radius);
  }
  
  //the sun changes by moving up the screen until the top of the sun touches the top of the frame,
  //when that happens it stops moving.
  public void updateState() {
    if (centerY - radius > 0) {
      centerY = centerY - deltaY;
    }
  }
  
  //to reset the state the center of the sun is set back to the height so that the sun is below the horizon.
  public void resetState() {
    centerY = height;
  }
  
} // End Sun class