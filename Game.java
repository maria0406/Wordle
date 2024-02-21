import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements Runnable {
    private BufferedImage back;

    // Objects
    private Borad board;
    private Word word;

    // Colors
    Color TEXT_1 = new Color(255, 255, 255);

    public Game() {
        back = null;
        word = new Word();
        board = new Borad();
        board.setWord(word.getRandomWord());
    }

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(5);
                repaint();
            }
        } catch (Exception e) {
        }
    }

    public void paint(Graphics g) {
        Graphics2D twoDgraph = (Graphics2D) g;
        if (back == null) {
            back = (BufferedImage) (createImage(getWidth(), getHeight()));
        }
        Graphics g2d = back.createGraphics();
        g2d.clearRect(0, 0, getSize().width, getSize().height);

        g2d.setFont(new Font("consolas", Font.PLAIN, 20));
        g2d.setColor(TEXT_1);

        g2d.drawString("Trent's WORDLE", 20, 30);
        g2d.drawString("Word: " + board.getWord().toUpperCase(), 20, 60);

        for (int i = 0; i < board.getMaxatts(); i++) {
            for (int j = 0; j < board.getLength(); j++) {
                g2d.drawRect(j * 70 + 50, i * 70 + 100, 60, 60);
            }
        }

        twoDgraph.drawImage(back, 0, 0, null);
    }

}