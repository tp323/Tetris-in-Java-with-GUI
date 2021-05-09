package tetris;

import javax.swing.*;
import java.awt.*;

public class GameArea extends JPanel {

    private final int cellSize = 25;
    private final int cellInterior = 24;

    public GameArea() {

        this.setBackground(Color.red);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponents(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.WHITE);

        //print grid 20 Lines x 10 Cols
        for (int x = 0; x <= 250; x += 25)
            for (int y = 0; y <= 500; y += 25)
                g.drawRect( x, y, 25, 25);

        g.setColor(Color.RED);
        //g.drawRect(1,1,25,25);
        g.fillRect(1,1,cellInterior,cellInterior);
        g.fillRect(cellSize+1,1,cellInterior,cellInterior);
        g.fillRect(cellSize+1,cellSize+1,cellInterior,cellInterior);
        g.fillRect(cellSize*2+1,cellSize+1,cellInterior,cellInterior);


    }


}
