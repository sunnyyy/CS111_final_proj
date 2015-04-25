/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * Clouds.java */

import java.awt.*; // use graphics

public class Clouds extends Sprite {
  
  private int centerX;
  private int centerY;
  private int bigHeight;
  private int bigWidth;
  private int littleHeight;
  private int littleWidth;
  private Color c1;
  private int green;
  private int delay;
  private int frameCounter;
  private int cloudHeight;
  private int cloudWidth;
  
  // constructor
  public Clouds(int tempCenterX, int tempCenterY, int tempDelay,
                int tempHeight, int tempWidth) {
    centerY = tempCenterY;
    centerX = tempCenterX;
    delay = tempDelay;
    frameCounter = 0;
    cloudHeight = tempHeight;
    cloudWidth = tempWidth;
    bigHeight = 2*cloudHeight/3;
    bigWidth = 2*cloudWidth/3;
    littleHeight = cloudHeight/3;
    littleWidth = cloudWidth/3;
    green = 50;
    c1 = new Color(255, green, 100);
  }
  
  // a cloud is made of 6 ovals:
  // 6 little ones to make the outline, one big one to fill in the hole in the middle
  public void drawState(Graphics g) {
    g.setColor(c1);
    
    // small oval #1 (top row, left)
    g.fillOval(centerX - littleWidth, centerY - 3*littleHeight/2,
               littleWidth, littleHeight);
    // small oval #2 (top row, right)
    g.fillOval(centerX, centerY - 3*littleHeight/2,
               littleWidth, littleHeight);
    // small oval #3 (middle row, left)
    g.fillOval(centerX - 3*littleWidth/2, centerY - littleHeight/2,
               littleWidth, littleHeight);
    
    // big center oval (#4)
    g.fillOval(centerX - bigWidth/2, centerY - bigHeight/2,
               bigWidth, bigHeight);
    
    // small oval #5 (middle row, right)
    g.fillOval(centerX + littleWidth/2, centerY - littleHeight/2,
               littleWidth, littleHeight);
    // small oval #6 (bottom row, left)
    g.fillOval(centerX - littleWidth, centerY + littleHeight/2,
               littleWidth, littleHeight);
    // small oval #7 (bottom row, right)
    g.fillOval(centerX, centerY + littleHeight/2,
               littleWidth, littleHeight);
  }
 
  // updates frameCounter; the clouds gradually go from light red to dark yellow
  public void updateState() {
    frameCounter = frameCounter + 1;
    if (frameCounter % delay == 0 && green <= 200) {
      green = green + 25;
    }
    c1 = new Color(255, green, 0);
  }
  
  // resets frameCounter to 0 and green to 50 (so Color(R, G, B) is red again)
  public void resetState() {
    green = 50;
    frameCounter = 0;
  }
  
} // End Cloud class