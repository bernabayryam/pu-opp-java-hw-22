package piece;

import java.awt.*;

public class Leader {
    private int row;
    private int column;
    private String color;

    public Leader() {
        this.row = row;
        this.column = column;
    }

    public void render(Graphics g) {
        for (int i = 0; i < 300; i += 100) {
            g.setColor(Color.YELLOW);
            g.fillOval(0, 0, 10, 10);
        }
    }
}