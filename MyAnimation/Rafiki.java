/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * Rafiki.java */

import java.awt.*; // use graphics

public class Rafiki extends Sprite {
  
  private int rafikiHeight;
  private int rafikiWidth;
  private int x;
  private int y;
  private int delay;
  private int frameCounter;
  
  
  // Rafiki is placed on top of the ledge of Pride Rock
  // (so the x and y are set to the ledge of Pride Rock).
  public Rafiki (int tempDelay) {
    x = 2*width/3;
    y = 3*height/4;
    rafikiHeight = height/15;
    rafikiWidth = width/25;
    delay = tempDelay;
    frameCounter = 0;
  }
  
  // Rafiki is the wise old monkey in The Lion King.
  // His body (head & torso) never moves, so it stays the same in every frame.
  // After a certain # of frames Rafiki lifts his arms (which start out horizontally,
  // holding a circular yellow simba) vertically above his head.
  public void drawState (Graphics g) {
    g.setColor(Color.gray);
    g.fillOval(x - rafikiWidth/2, y - rafikiHeight/2,
               rafikiWidth, rafikiHeight); // Rafiki body
    g.fillOval(x - rafikiWidth/2, y - rafikiHeight,
               2*rafikiWidth/3, 2*rafikiHeight/3); // Rafiki head
    g.setColor(new Color(255, 200, 0));
    
    // before lifting Simba
    if(frameCounter < delay) {
      g.fillOval(x - 3*rafikiWidth/2, y - 3*rafikiHeight/4,
                 rafikiWidth/2, rafikiWidth/2);             // Simba
      g.setColor(Color.gray);
      g.fillOval(x - rafikiWidth, y - rafikiHeight/2,
                 rafikiHeight, rafikiHeight/5);             // Rafiki arms
      
      // after lifting Simba
    } else {
      g.fillOval(x - 3*rafikiWidth/4, y - 2*rafikiHeight,
                 rafikiWidth/2, rafikiWidth/2);             // Simba
      g.setColor(Color.gray);
      g.fillOval(x - rafikiWidth/2, y - 3*rafikiHeight/2,
                 rafikiHeight/5, 3*rafikiHeight/2);         // Rafiki arms
    }
  }
  
  // updateState just updates the frameCounter so that we know when we've hit
  // the specified frame when Rafiki lifts his arms up.
  public void updateState() {
    frameCounter = frameCounter + 1;
  }
  
  // resetState sets frameCounter back to 0
  public void resetState() {
    frameCounter = 0;
  }
  
} // end Rafiki class