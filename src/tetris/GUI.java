package tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private int count = 0;
    private final int WIDTH = 458, HEIGHT = 565;

    private final JLabel label = new JLabel("NUM PLAYS = 0");
    private GameArea gameArea;
    private JPanel panel = new JPanel();

    public static void main(String[] args) { new GUI(); }

    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("PLAY");
        button.addActionListener(this);

        panel.add(button);
        panel.add(label);

        gameArea = new GameArea();

        frame.add(panel, BorderLayout.EAST);
        frame.add(gameArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TETRIS");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("NUM PLAYS = " + count);
    }
}
