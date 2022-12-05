import processing.core.*;

public class Problem03 extends PApplet {
    float angle;


    public void settings() {
        fullScreen();

    }

    public void setup() {
        strokeWeight(6);

    }

    public void draw() {
        background(0, 0, 0);
        drawStar(width / 2f, height / 2f, height / 10f, angle, 255, 0, 0);
        drawStar(width / 4f, height / 4f, height / 15f, angle, 255, 255, 0);
        drawStar(width / 1.3f, height / 1.3f, height / 15f, angle, 255, 255, 0);

        angle += 0.05f;

    }

    void drawStar(float xc, float yc, float r, float angle, float rc, float gc, float bc) {
        pushMatrix();
        translate(xc, yc);
        rotate(angle);
        stroke(rc, gc, bc);
        line(-r, 0, r, 0);
        line(0, -r, 0, r);
        line(-r / 4f, r / 4f, r / 4f, -r / 4f);
        line(r / 4f, -r / 4f, -r / 4f, r / 4f);
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}