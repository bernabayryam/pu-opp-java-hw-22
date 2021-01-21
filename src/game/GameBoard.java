package game;
//TODO
import piece.Guard;
import piece.Leader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard<selectedPiece> extends JFrame {
    private ArrayList<Object> piecePosition;
    private Object selectedPiece;

    public GameBoard() {

        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Leader());
        this.piecePosition.add(new Leader());
        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Guard());
        this.piecePosition.add(new Guard());


        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


    public void mouseClicked(MouseEvent e) {
        int row = this.getBoardDimention(e.getY());
        int col = this.getBoardDimention(e.getX());

        if (this.selectedPiece != null) {
        }

    }

    private int getBoardDimention(Object y) {
        return 0;
    }

    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {

                GameTiles tile = new GameTiles(row, column);
                tile.render(g);
                Guard guard = new Guard();
                guard.render(g);
                Leader leader = new Leader();
                leader.render(g);

            }
        }
    }
}
