/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 2 MyAnimation
 * LionKingShowcase.java */

import java.awt.*; // use colors

public class LionKingShowcase extends AnimationShowcase {

  public LionKingShowcase () {
    // Add any animations for your PS10 Task 2 Animation here
    // You should change the string and class name "MyAnimation"
    // to be something that reflects the nature of your project. 
    addAnimation("LionKingAnimation", new LionKingAnimation());
  }
    
  public static void main (String[] args) {
    runAsApplication(new LionKingShowcase(), "LionKingAnimation"); 
  }
}