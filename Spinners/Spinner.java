/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 1 Spinners
 * Spinner.java */

import java.awt.*;

class Spinner extends Sprite 
{
  // instance variables  
  private int centerX;
  private int centerY;
  private int vertRadius;
  private int horzRadius;
  private int changeRadius;
  private Color c1;
  private Color c2;
  private boolean isColor2;
  private int staticX;
  
  // constructor 
  public Spinner(int x, int y, int radius, int dRadius, Color color1, Color color2)
  {
    centerX = x;
    centerY = y;
    staticX = x;
    vertRadius = radius;
    horzRadius = radius;
    changeRadius = dRadius;
    c1 = color1;
    c2 = color2;
    isColor2 = false;
  }
  
  // resets
  public void resetState() {
    isColor2 = false;
    horzRadius = vertRadius;
  }
  
  // updates the width of the oval
  public void updateState() {
    horzRadius = horzRadius - changeRadius;
    centerX = centerX + changeRadius;
    if (horzRadius <= 0) {
      changeRadius = -changeRadius; // oval gets big again
      isColor2 = true;
    }
    if (horzRadius >= vertRadius) {
      changeRadius = -changeRadius; // oval gets small again
      isColor2 = false;
    }
  }
  
  // draws spinners & string
  public void drawState(Graphics g) {
    g.setColor(Color.black);
    g.drawLine(staticX, 0, staticX, centerY - vertRadius); // draws string
    if(!isColor2) {
      g.setColor(c1); // sets the color to c1 if boolean is false
    } else {
      g.setColor(c2); // otherwise sets the color to c2
    }
    // draws the spinner  
    g.fillOval(centerX - vertRadius, centerY - vertRadius, 2*horzRadius, 2*vertRadius);
  }
  
} // End Spinner class