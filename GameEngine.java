package recyclean;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameEngine extends Component{

	//Variables
	private boolean event = false, t = false, r = false, space = false;
	BufferedImage trash, recycle;
	Bucket[] bins = new Bucket[5];
	
	//Variables
	
	//Constructor
	public GameEngine()
	{
		//try to get images in there. 
		try {
			trash = ImageIO.read(new File("Trash Bin.png"));
			recycle = ImageIO.read(new File("Recycle Bin.png"));
		} catch (IOException e) {
		}
		
		//Sidebar side = new Sidebar();
		System.out.println(bins);
		boolean[] arr = {true, false, false, false, false}; 
		Coordinate loc = new Coordinate(Config.SCREEN_WIDTH/3 , Config.SCREEN_HEIGHT/2);
		Coordinate size = new Coordinate(0, 0); //TODO change to be the actual size of the image.
			bins[0] = new Bucket(arr, loc, size, trash);
		//Shift around the vars to allow for bucket 2. 
		arr[0] = false; arr[1] = true;
		loc.incrementX(Config.SCREEN_WIDTH/3);
			bins[1] = new Bucket(arr, loc, size, recycle);
		//System.out.println(bins[0].getLocation().getX() == null);
	}
	//Constructor
	
	//Methods
	public void paint(Graphics g)
	{
		//Draw all of the non-null bins.
		g.drawImage(bins[0].getImage(), bins[0].getLocation().getX(), bins[0].getLocation().getY(), null);
		g.drawImage(bins[1].getImage(), bins[1].getLocation().getX(), bins[1].getLocation().getY(), null);
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
	}
	
	private void loop()
	{
		if( true/*//TODO Any keyaction event occurs*/ ) event = true;
		if(event)
		{
			//T is pressed
			if(t)
			{
				
			}
			//R is pressed
			if(r)
			{
				
			}
			
			//Space is pressed for the pause button. 
			if(space)
			{
				
			}
		}
			
		//Set event to be false at the end of the loop. 
		event = false; 
	}
	
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Short Worm Memory");
        
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new GameEngine());
        f.pack();
        f.setVisible(true);
	}

}
