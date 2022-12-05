import processing.core.*;

public class Problem05 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 30;

    float minRadius;
    float maxRadius;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);
        float x = width / 2f;
        float y = height / 2f;
        float r = min(width, height) / 2f;
        float dr = r / NUMBER_OF_CIRCLES;
        float redCom = 5;
        float dRedCom = (255 - redCom) / NUMBER_OF_CIRCLES;
        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            fill(redCom, 0, 0);
            circle(x, y, 2 * r);
            r -= dr;
            redCom += dRedCom;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}