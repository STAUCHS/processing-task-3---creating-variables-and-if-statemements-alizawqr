import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
    // put your size call here
    size(500, 500);
    }
    
  public void setup() {
    background(227, 209, 237);

    float randomX = random(0, 500);
    float randomY = random(0, 500);

    if (randomX < 250 || randomY < 250){
      // Light
      stroke(125);
      strokeWeight(3);
      fill(252, 239, 154);
      ellipse(randomX, randomY, 120, 120);

      // Shade
      fill(125);
      rect(randomX + 10, randomY - 60, 55, 120);

      // Stand
      strokeWeight(15);
      line(randomX + 20, randomY + 60, randomX + 20, randomY + 240);

      // Bottom
      rect(randomX - 85, randomY + 240, 200, 30);


    }
    else if (randomX > 250 || randomY > 250){
      // Light
      stroke(125);
      strokeWeight(3);
      fill(252, 239, 154);
      ellipse(randomX, randomY, 120, 120);

      // Shade
      fill(125);
      rect(randomX + 10, randomY - 60, 55, 120);

      // Stand
      strokeWeight(15);
      line(randomX + 20, randomY + 60, randomX + 20, randomY + 240);

      // Bottom
      rect(randomX - 85, randomY + 240, 200, 30);
    }
    }
    
  public void draw() {

    // Define time variables
    int hr = hour();
    int min = minute();

    // Set time
    fill(0);
    textSize(75);
    text(hr, 100, 150);
    text(min, 100, 250);

        
        
}

}