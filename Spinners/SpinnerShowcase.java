/* Sunnia Ye & Misha Olynyk
 * CS 111 PS 11 Task 1 Spinners
 * SpinnerShowcase.java */

import java.awt.*; // use colors

public class SpinnerShowcase extends AnimationShowcase 
{
    public SpinnerShowcase ()
    {
        addAnimation("Spinners", new SpinnerAnimation());
    }
    
    public static void main (String[] args)
    {
        runAsApplication(new SpinnerShowcase(), "SpinnerShowcase"); 
    }
    
}
