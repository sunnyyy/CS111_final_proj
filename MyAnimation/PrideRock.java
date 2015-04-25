/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * PrideRock.java */

import java.awt.*; // use graphics

public class PrideRock extends Sprite {
  
  // instance variables
  private int yHorizon;
  private int[] xPoints1;
  private int[] yPoints1;
  private int[] xPoints2;
  private int[] yPoints2;
  private int[] xPoints3;
  private int[] yPoints3;
  private Color c1;
  private int frameCounter;
  
  // constructor
  public PrideRock () {
    yHorizon = 9*height/10; // ground
    c1 = new Color(50, 20, 0); // dark brown
    
    // The int arrays below are for fillPolygon(int[], int[], int n), which
    // takes 1 int array of total x-coordinates and 1 int array of total y-coordinates
    // plots points out of those. (Ex: a triangle would have n = 3 vertices at
    // (x[0], y[0]) , (x[1], y[1]) , and (x[2], y[2]).)
    
    // Big triangle in Pride Rock
    xPoints1 = new int[3];
    xPoints1[0] = width;
    xPoints1[1] = 4*width/5;
    xPoints1[2] = 4*width/5;
    yPoints1 = new int[3];
    yPoints1[0] = height;
    yPoints1[1] = height;
    yPoints1[2] = height/2;
    
    // Slanted triangle (ledge) in Pride Rock
    xPoints2 = new int[3];
    xPoints2[0] = width;
    xPoints2[1] = width;
    xPoints2[2] = 2*width/3;
    yPoints2 = new int[3];
    yPoints2[0] = yHorizon;
    yPoints2[1] = height;
    yPoints2[2] = 3*height/4;
    
    // Little (base) triangle in Pride Rock
    xPoints3 = new int[3];
    xPoints3[0] = 3*width/4;
    xPoints3[1] = 2*width/3;
    xPoints3[2] = 7*width/10;
    yPoints3 = new int[3];
    yPoints3[0] = height;
    yPoints3[1] = height;
    yPoints3[2] = (yHorizon + 2*height/3)/2;
  }
  
  // draws Pride Rock (3 triangles) and horizon.
  public void drawState(Graphics g) {
    g.setColor(c1);
    g.fillPolygon(xPoints1, yPoints1, 3);
    g.fillPolygon(xPoints2, yPoints2, 3);
    g.fillPolygon(xPoints3, yPoints3, 3);
    g.fillRect(0, yHorizon, width, height);
  }
  
  // updates it so that the landscape brightens every 20 frames, up until frame #80
  public void updateState() {
    frameCounter = frameCounter + 1;
    if (frameCounter % 20 == 0 && frameCounter <= 80) {
      c1 = c1.brighter();
    }
  }
  
  // resets framecounter and landscape color
  public void resetState() {
    c1 = new Color(50, 20, 0); // dark brown
    frameCounter = 0;
  }
  
} // End PrideRock class