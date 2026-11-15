import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player {
    int direction = 1;

    public void moveLeft(){
        direction = -1;
    }

    public void moveRight(){
        direction = 1;
    }

    public void updatePosition(){
        // Update the player's position based on velocity and direction
    }

    public void jump(){
        //if player is on the ground,
        //make them go up vertically
        //then implement gravity so they go down
    }

    //'listens' for which key is pressed
    public void keyPressed(KeyEvent e) {
        KeyEvent k = (KeyEvent) e;
        int key = k.getKeyCode();

        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
            moveLeft();
        } else if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
            moveRight();
        } else if (key == KeyEvent.VK_SPACE || key == KeyEvent.VK_UP) {
            jump();
        }
    }
}
