import processing.core.*;

public class Problem04 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 100;

    float minRadius;
    float maxRadius;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        minRadius = min(width, height) / 100f;
        maxRadius = max(width, height) / 70f;
        frameRate(2);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            float x = random(0, width);
            float y = random(0, height);
            float r = random(minRadius, maxRadius);
            float redCom = random(255);
            float greenCom = random(255);
            float blueCom = random(255);

            fill(redCom, greenCom, blueCom);

            circle( x, y, 2 * r);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}