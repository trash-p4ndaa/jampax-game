import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    Player player = new Player();
    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.PINK);
        g2d.fillRect(player.x, player.y, player.width, player.height);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        Main game = new Main();
        frame.add(game);

        game.player.x = frame.getWidth() / 2 - 30;
        game.player.y = frame.getHeight() / 2 - 30;
        frame.setVisible(true);
    }
}