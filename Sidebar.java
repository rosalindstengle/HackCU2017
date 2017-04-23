package recyclean;
import java.util.Random;

import javax.swing.JLabel;

public class Sidebar 
{
	//Variables
	private Coordinate location, size;
	private LinkedList<Item> list;
	private JLabel image;
	private JLabel[] items;
	
	//The size of the Items within the sidebar
	private static final int sx = Config.ITEM_SIZE;
	private static final int sy = Config.ITEM_SIZE;
	//The location of the items within the sidebar
	private static final int lx = Config.SIDE_BAR_SIZE_X/2 - sx/2;

	//Variables
	
	//Constructor
	public Sidebar()
	{
		location.setX(0);
		location.setY(0);
		size.setX(Config.SIDE_BAR_SIZE_X);
		size.setY(Config.SIDE_BAR_SIZE_Y);
	}
	//Constructor
	//Methods
	/**
	 * First randomize a new element, along with a new image for it. 
	 * Delete the old item.  Shift the old items upward, along with the new random element. 
	 * Construct new items based upon the list, that appear over the sidebar with respect to it. 
	 * 
	 * @return the item that was removed, in order to check against trashcan data. 
	 */
	public Item update()
	{
		//Variables
			Item out = null, item = null;
			Node<Item> curr;
			Coordinate loc, location, size;
			Random gen = new Random();
			int itemChoice;
		//Variables
		
		//Check to see if the list size is greater than what we can display. 
		if(list.size() >= Config.SNEAK_PEAK)
		{
			//The top most one will be removed. 
			out = list.removeTop();
			curr = list.getHead();
			
			//Go through and reduce the location of all of the items by 100, moving them up the list. 
			for(int i = 0; i < list.size(); i++)
			{
				//To increase clarity, get loc. 
				loc = curr.getData().getLocation();
				loc.setY(loc.getY() - 100);
				curr = curr.getNext();
			}
		}
		
		//Add a new item with each update.  ONLY CALL UPDATE WHEN KEYLISTENERPRESSED FOR GAMEENGINE
		itemChoice = gen.nextInt(Config.level + 1);
			//Get the location and size for the new item...
		location = new Coordinate(lx, list.size() * Config.ITEM_SPACING + Config.ITEM_TOP_BORDER);
		size = new Coordinate(sx, sy);
		
		//TODO get the images correctly linked up when we are done with this. 
		switch(itemChoice)
		{
		case 0: list.add(new trashItem(1, 3, null, location, size));
				break;
		case 1: list.add(new recycleItem(1, 3, null, location, size));
				break;
		default: System.out.println("Message not linkable.");
				break;
		}
		
		//TODO determine if we need to call display here, or if that will be handled in the game engine. 
		return out;
	}
	/** 
	 * Calls update 4 times at the very beggining of the program 
	 * in order to populate the list with entries. 
	 */
	public void init()
	{
		for(int i = 0; i < Config.SNEAK_PEAK; i++)
		{
			update();
		}
	}
	
	/** 
	 * Display in order the components making up the Sidebar
	 */
	public void display()
	{
		//Variables
		Node<Item> curr = list.getHead();
		//Variables
		
		//Display the scoreboard item. 
		//TODO how to display shit. 
		//Display items 1 - Config.SNEAK_PEAK
		for(int i = 0; i < Config.SNEAK_PEAK; i++)
		{
			//TODO what are we doing for the hecking display
			curr = curr.getNext();
		}
	}
}
