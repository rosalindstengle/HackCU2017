package recyclean;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class LoadImageApp extends Component {
          
    BufferedImage img, img2;
    
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
        g.drawImage(img2, 50, 0, null);
        
    }

    public LoadImageApp() {
       try {
           img = ImageIO.read(new File("strawberry.jpg"));
           img2 = ImageIO.read(new File("strawberry.jpg"));
       } catch (IOException e) {
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
       }
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
}

