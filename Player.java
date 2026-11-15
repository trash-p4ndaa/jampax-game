import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Main{
    int direction = 1;
    int gravity = 1;
    int border_y = 100;
    int x = game.player.x, y = game.player.y, vx, vy;
    double dt = 0.5;
    boolean on_ground = true;

    int height = 50, width = 50;

    public void moveLeft(){
        direction = -1;
        x -= vx;
    }

    public void moveRight(){
        direction = 1;
        x += vx;
    }

    public void updatePosition(){
        // Update the player's position based on velocity and direction
    }

    public void jump(){
        //if player is on the ground,
        //make them go up vertically
        //then implement gravity so they go down
        while(on_ground){
            do{
                y+=vy;
            }while(y<border_y);
        }

        if(!on_ground){
            y-=gravity;
        }
    }

    //'listens' for which key is pressed
    public void keyPressed(KeyEvent e) {
        KeyEvent k = (KeyEvent) e;
        int key = k.getKeyCode();

        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
            vx = 3;
            moveLeft();
        } else if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
            vx = 3;
            moveRight();
        } else if (key == KeyEvent.VK_SPACE || key == KeyEvent.VK_UP) {
            vy = 3;
            jump();
        }
    }
}
