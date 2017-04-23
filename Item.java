package recyclean;

import javax.swing.JLabel;

public abstract class Item {

	//Variables
	boolean[] type;
	int pointsGained, penalty;
	JLabel image;
	Coordinate location, size, center;
	//Variables
	
	//Getters
	/**
	 * [a, b, c, d, e]
	 * a = trash item
	 * b = recycle item
	 * @return
	 */
	public boolean[] getType() {
		return type;
	}
	public int getPointsGained(){
		return pointsGained;
	}
	public int getPenalty(){
		return penalty;
	}
	public JLabel getImage(){
		return image;
	}
	public Coordinate getLocation(){
		return location;
	}
	public Coordinate getSize(){
		return size;
	}
	//Getters
	
	//Setters
	public void setLocation(Coordinate location){
		this.location = location;
	}
	//Setters
	
	//Methods
	boolean validCheck()
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
	void launch()
	{
		
		//Do nothing for right now. Will eventually implement physics to launch stuff. 
	}
	//Methods
	
}
