package tetris;

import javax.swing.*;
import java.awt.*;

public class GameArea extends JPanel {

    private final int cellSize = 25;
    private final int cellInterior = 24;

    //  TETROMINOS
    /*
    1   I-block cyan
        0000
        ####
        0000
        0000

    2   J-block blue
        0000
        #000
        ###0
        0000

    3   L-block orange
          #
        ###

    4   Q-block yellow
        ##
        ##

    5   S-block green
         ##
        ##

    6   T-block purple
         #
        ###

    7   Z-block red
        ##
         ##
    */

    private boolean[][] iblock = new boolean[4][4];
    private boolean[][] jblock = new boolean[4][4];
    private boolean[][] lblock = new boolean[4][4];
    private boolean[][] oblock = new boolean[4][4];
    private boolean[][] sblock = new boolean[4][4];
    private boolean[][] tblock = new boolean[4][4];
    private boolean[][] zblock = new boolean[4][4];



    public GameArea() {
        initTetrominos();
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

    private void initTetrominos(){
        clearMatrix(iblock);
        clearMatrix(jblock);
        clearMatrix(lblock);
        clearMatrix(oblock);
        clearMatrix(sblock);
        clearMatrix(tblock);
        clearMatrix(zblock);

        placeBlocks();


        for (boolean[] booleans : oblock) {
            for (int n = 0; n < lblock.length; n++) {
                System.out.print(booleans[n] + " ");
            }
            System.out.println();
        }
    }

    private boolean[][] clearMatrix(boolean[][] block){
        for(int x=0; x<block.length;x++){
            for(int y=0; y<block.length;y++){
                block[x][y] = false;
            }
        }return block;
    }

    private void placeBlocks(){
        iblock[1][0] = true;
        iblock[1][1] = true;
        iblock[1][2] = true;
        iblock[1][3] = true;

        jblock[1][0] = true;
        jblock[2][0] = true;
        jblock[2][1] = true;
        jblock[2][2] = true;

        lblock[1][2] = true;
        lblock[2][0] = true;
        lblock[2][1] = true;
        lblock[2][2] = true;

        oblock[1][1] = true;
        oblock[1][2] = true;
        oblock[2][1] = true;
        oblock[2][2] = true;
    }


}
