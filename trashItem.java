package recyclean;

import javax.swing.JLabel;

public class trashItem extends Item
{
	//Constructor
	public trashItem(int pointsEarned, int penalty, JLabel image, Coordinate location, Coordinate size)
	{
		//Set it to be true for the recycle item. 
		boolean[] newArr = {true, false, false, false, false};
		this.type = newArr;
		this.pointsGained = pointsEarned;
		this.penalty = penalty;
		this.image = image;
		this.location = location;
		this.size = size;
	}
	//Constructor
}
