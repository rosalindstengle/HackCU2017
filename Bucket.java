package recyclean;
import javax.swing.*;

public class Bucket 
{
	//Variables
	boolean[] type;
	Coordinate location, size;
	JLabel image;
	//Variables
	
	//Constructors
	public Bucket(boolean[] type, Coordinate location, Coordinate size, JLabel image)
	{
		this.type = type;
		validCheck();
		this.location = location;
		this.size = size;
		this.image = image;
	}
	//Constructors
	
	//Getters
	public boolean[] getType() {
		return type;
	}

	public Coordinate getLocation() {
		return location;
	}

	public Coordinate getSize() {
		return size;
	}

	public JLabel getImage() {
		return image;
	}
	//Getters

	//Setters
	public void setType(boolean[] type) {
		this.type = type;
	}

	public void setLocation(Coordinate location) {
		this.location = location;
	}

	public void setSize(Coordinate size) {
		this.size = size;
	}

	public void setImage(JLabel image) {
		this.image = image;
	}
	//Setters


	//Methods
	
	/**
	 * Checks to see if the item that is input into the can is the right type of item for the can
	 * 
	 * Assumes: validCheck() has already been called and an item has been passed into the can.
	 * After: GameEngine will call item to enact appropriate penatlies/rewards based on the outcome of typecheck. 
	 * @return if the item input is of the same type as the trash. 
	 */
	private boolean typeCheck(Item item)
	{
		//Variables
		boolean ret = false;
		//Variables
		
		//Body
		//Check to see if the type of the item passed into it is the type of it's trash. 
		for(int i = 0; i < Config.LEVEL_MAX; i++)
		{
			//If the type and item type are the same at the same index...
			if(type[i] == item.getType()[i])
			{
				//set to true
				ret = true;
			}
		}
		
		return ret;
	}
	/**
	 * Checks to see if the type is of valid size, and has valid conditions inside of it. 
	 * 
	 * Assumes: type has been initialized, and is non-null.
	 * @return whethre or not it has valid conditions. 
	 */
	private boolean validCheck()
	{
		//Variables
		boolean ret = false;
		int trueCounter = 0; 
		//Variables

		//Check to see if there is exactly one element, and that the size is correct. 
		//It will only go up to the level max, there can't be anymore. 
		for(int i = 0; i < Config.LEVEL_MAX; i++)
		{
			if(type[i]) trueCounter++;
		}
		
		//Check if it meets both those conditions. 
		if(trueCounter > 1 && type.length < Config.LEVEL_MAX) ret = true;
		
		return ret;
	}
	//Methods
}
