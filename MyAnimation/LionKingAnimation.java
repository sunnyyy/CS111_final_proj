/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * LionKingAnimation.java */

import java.awt.*; // 

class LionKingAnimation extends Animation { 
  
  private Color c1;
  
  public LionKingAnimation(){
    this.c1 = Color.blue;
    
    // Add your sprits and animation controls here. 
    addSprite(new Sky(10), "sky");
    addSprite(new Sun(2), "sun");
    addSprite(new Clouds(75, 150, 10, 50, 100), "clouds");
    addSprite(new Clouds(400, 150, 10, 50, 200), "clouds");
    addSprite(new Clouds(500, 100, 10, 30, 100), "clouds");
    addSprite(new Clouds(50, 50, 10, 50, 100), "clouds");
    addSprite(new Clouds(100, 50, 10, 50, 100), "clouds");
    addSprite(new PrideRock(), "Pride Rock");
    addSprite(new Rafiki(50), "Rafiki");
    
    this.setNumberFrames(Animation.NO_MAX_FRAMES);
    // Study other animations and the AnimationWorld contract
    //    for the kind of things that you can do 
  }
  
}
