package tetris;

import javax.swing.*;
import java.awt.*;

public class GameArea extends JPanel {

    private final int cellSize = 25;
    private final int cellInterior = 24;

    /*  TETROMINOS
    1   I-block cyan
        ####
        0000
        0000
        0000

    2   J-block blue
        #000
        ###0
        0000
        0000

    3   L-block orange
        00#0
        ###0
        0000
        0000

    4   Q-block yellow
        ##00
        ##00
        0000
        0000

    5   S-block green
        0##0
        ##00
        0000
        0000

    6   T-block purple
        0#00
        ###0
        0000
        0000

    7   Z-block red
        ##00
        0##0
        0000
        0000*/

    private boolean[][] iblock = new boolean[4][4];
    private boolean[][] jblock = new boolean[4][4];
    private boolean[][] lblock = new boolean[4][4];
    private boolean[][] qblock = new boolean[4][4];
    private boolean[][] sblock = new boolean[4][4];
    private boolean[][] tblock = new boolean[4][4];
    private boolean[][] zblock = new boolean[4][4];

    Graphics n;



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.WHITE);
        n = g;
        //print grid 20 Lines x 10 Cols
        for (int x = 0; x <= 250; x += 25) for (int y = 0; y <= 500; y += 25) g.drawRect( x, y, 25, 25);
        g.setColor(Color.RED);
        printTetromino(g,zblock,1,1);

    }

    public GameArea() {
        initTetrominos();
    }

    private void printTetromino(Graphics g,boolean[][] block, int x, int y){
        for(int c = 0; c<4; c++)
            for(int l = 0; l<4; l++)
                if(block[c][l]) g.fillRect(cellSize*c + x,cellSize*l + y,cellInterior,cellInterior);
    }

    private void initTetrominos(){
        /*clearMatrix(iblock);
        clearMatrix(jblock);
        clearMatrix(lblock);
        clearMatrix(qblock);
        clearMatrix(sblock);
        clearMatrix(tblock);
        clearMatrix(zblock);*/

        placeBlocks();

    }

    private boolean[][] clearMatrix(boolean[][] block){
        for(int x=0; x<block.length;x++){
            for(int y=0; y<block.length;y++){
                block[x][y] = false;
            }
        }return block;
    }

    private void placeBlocks(){
        iblock[0][0] = true;
        iblock[1][0] = true;
        iblock[2][0] = true;
        iblock[3][0] = true;

        jblock[0][0] = true;
        jblock[0][1] = true;
        jblock[1][1] = true;
        jblock[2][1] = true;

        lblock[2][0] = true;
        lblock[0][1] = true;
        lblock[1][1] = true;
        lblock[2][1] = true;

        qblock[0][0] = true;
        qblock[1][0] = true;
        qblock[0][1] = true;
        qblock[1][1] = true;

        sblock[1][0] = true;
        sblock[2][0] = true;
        sblock[0][1] = true;
        sblock[1][1] = true;

        tblock[1][0] = true;
        tblock[0][1] = true;
        tblock[1][1] = true;
        tblock[2][1] = true;

        zblock[0][0] = true;
        zblock[1][0] = true;
        zblock[1][1] = true;
        zblock[2][1] = true;
    }

}
