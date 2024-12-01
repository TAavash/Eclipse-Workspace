package image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageLoop extends JPanel implements ActionListener{

    private BufferedImage[] images;
    private int currentImageIndex = 0;

    public ImageLoop(BufferedImage[] images) {
        this.images = images;
        startAnimation();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(images[0].getWidth(), images[0].getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(images[currentImageIndex], 0, 0, null);
    }

    private void startAnimation() {
        int delay = 1000; // 1 second
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                currentImageIndex = (currentImageIndex + 1) % images.length;
                repaint();
            }
        };
        new Timer(delay, taskPerformer).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Loop");
            try {
                BufferedImage[] images = {
                        ImageIO.read(new URL("https://i.imgur.com/87e0IbU.jpg")),
                        ImageIO.read(new URL("https://i.imgur.com/K2I9OSj.jpg")),
                        ImageIO.read(new URL("https://i.imgur.com/sbFvGv2.jpg"))
                };
                ImageLoop imageLoop = new ImageLoop(images);
                frame.getContentPane().add(imageLoop);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
