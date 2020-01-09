package club.banyuan.klotskl.view;

import javax.swing.*;
import java.awt.*;

public class Window extends JPanel {
    private Image image;
    private Dimension dimension;

    public Window(Image image, Dimension dimension) {
        this.image = image;
        this.dimension = dimension;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
