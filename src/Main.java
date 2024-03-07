import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int borderWidth = 500;
        int borderHeight = borderWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(borderWidth, borderHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(borderWidth, borderHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}