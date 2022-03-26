import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Quad 1 (10 x 10 grid)
    stroke(0);
    for (int lineX = 0; lineX < width/2; lineX += width/2/10){
      line(lineX, 0, lineX, height/2);
    }
    for (int lineY = 0; lineY < height/2; lineY += height/2/10){
      line(0, lineY, width/2, lineY);
    }
  
    // Quad 2 (5 x 5 circle)
    for (int circleY = height/20; circleY < height/2; circleY += height/2/5){
      for (int circleX = width/2 + width/20; circleX < width; circleX += width/2/5){
        fill(212,15,125);
        ellipse(circleX, circleY, width/20, height/20);
      }
    }

    /*// Quad 3
    for (int gradient = 0; gradient < width/2; gradient++) {
      stroke(gradient, gradient, gradient);
      strokeWeight(3);
      line(gradient, height/2, gradient, height);
      
    }
    */

    // Quad 4

    // Draw flower
    for (int flower = 0; flower < 136; flower+=45) {
      pushMatrix();
      translate(width/2 + width/4, height/2 + height/4);
      rotate(radians(flower));
      fill(220, 93, 52);
      ellipse(0, 0, width/20, height/3);
      popMatrix();
    }

    // Draw centre of flower
    fill(38, 108, 45);
    ellipse(width/2 + width/4, height/2 + height/4, width/15, height/15);



  // define other methods down here.
}

}       