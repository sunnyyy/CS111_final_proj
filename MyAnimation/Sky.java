/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * Sky.java */

import java.awt.*; // use graphics

public class Sky extends Sprite {
  
  //instance variables
  private Color c1;
  private int green;
  private int delay;
  private int frameCounter;
  
  //the sky like in night background updates via a delay so that it doesn't grow more yellow too fast. 
  public Sky (int tempDelay) {
    green = 0;
    c1 = new Color(255, green, 0); //our sky begins with color.red but needs to be specified so we can add in green
    delay = tempDelay;
    frameCounter = 0;
  }
  
  //Sky is just the entire screen, it's basically a backdrop.
  public void drawState(Graphics g) {
    g.setColor(c1);
    g.fillRect(0, 0, width, height);
  }
 
  //Sky is pretty well nightbackground except instead of getting darker it gets brighter, or rather
  //more yellowy. In order to get it more yellowy we started off with a very red color that we specified
  //then we added green into it, adding 25 to the green integer at a time. Once green gets up to 175 we
  //stop adding in that color thus reaching a limit so the sky isn't blindingly yellow. 
  public void updateState() {
    frameCounter = frameCounter + 1;
    if (frameCounter % delay == 0 && green <= 175) {
      green = green + 25; //updating green for a more yellow cast
    }
    c1 = new Color(255, green, 0); //here we update c1
  }
  
  //to reset all we had to do was reset green to 0 and the frame counter to 0
  public void resetState() {
    green = 0;
    frameCounter = 0;
  }
  
} // End Sky class