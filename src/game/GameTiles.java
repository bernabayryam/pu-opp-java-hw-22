package game;

import java.awt.*;

public class GameTiles {

    private final int row;
    private final int column;
    private final int TileSize;

    public GameTiles(int row, int column) {

        this.row = row;
        this.column = column;
        this.TileSize = 100;

    }

    public void render(Graphics g) {

        int tileX = this.column * this.TileSize;
        int tileY = this.row * this.TileSize;

        Color Red = new Color(254, 105, 103);
        Color Black = new Color(20, 18, 18);
        Color Grey = new Color(226, 226, 226);

        if (this.row == 0 && this.column == 0 ||
                this.row == 0 && this.column == 4 ||
                this.row == 4 && this.column == 1 ||
                this.row == 4 && this.column == 3) {
            g.setColor(Red);
        }

        if (this.row == 0 && this.column == 1 ||
                this.row == 0 && this.column == 3 ||
                this.row == 4 && this.column == 0 ||
                this.row == 4 && this.column == 4) {
            g.setColor(Black);
        }
        if (this.row == 1 && this.column == 0 ||
                this.row == 1 && this.column == 1 ||
                this.row == 1 && this.column == 3 ||
                this.row == 1 && this.column == 4 ||
                this.row == 3 && this.column == 0 ||
                this.row == 3 && this.column == 1 ||
                this.row == 3 && this.column == 3 ||
                this.row == 3 && this.column == 4) {
            g.setColor(Grey);
        }

        if (this.row == 0 && this.column == 2 ||
                this.row == 1 && this.column == 2 ||
                this.row == 2 && this.column == 0 ||
                this.row == 2 && this.column == 1 ||
                this.row == 2 && this.column == 2 ||
                this.row == 2 && this.column == 3 ||
                this.row == 2 && this.column == 4 ||
                this.row == 3 && this.column == 2 ||
                this.row == 4 && this.column == 2) {
            g.setColor(Color.WHITE);
        }

        g.fillRect(tileX, tileY, this.TileSize, this.TileSize);

        g.setColor(Grey);
        g.fillOval(200, 25, 50, 50);
    }
}

