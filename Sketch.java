import processing.core.PApplet;

public class Sketch extends PApplet {
	
	float lineX = 0;

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

    // 10 x 10 grid
    stroke(0);
    for (int lineX = 0; lineX < width/2; lineX += width/2/10){
      line(lineX, 0, lineX, height/2);
    }
    for (int lineY = 0; lineY < height/2; lineY += height/2/10){
      line(0, lineY, width/2, lineY);
    }
  
    // 5 x 5 circle
    for (int circleY = height/20; circleY < height/2; circleY += height/2/5){
      for (int circleX = width/2 + width/20; circleX < width; circleX += width/2/5){
        fill(212,15,125);
        ellipse(circleX, circleY, width/20, height/20);
      }
    }

    // Gradient
    for (int RGB = 0; RGB != 255; RGB++){
      stroke(RGB, RGB, RGB);
      strokeWeight(3);
      lineX += (float)(width/2) / 255;
      if (lineX < width/2){
        line(lineX, height/2, lineX, height);
      }
    }


    
  // define other methods down here.
}

}       