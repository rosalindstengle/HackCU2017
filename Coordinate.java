package recyclean;

public class Coordinate
{
	//Variables
	int x, y;
	//Variables
	
	//Constructor
	public Coordinate()
	{
		this.x = 0;
		this.y = 0;
	}
	public Coordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//Constructor

	//Getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//Getters

	//Setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	//Setters
	
	//Methods
	public void incrementX(int x){
		this.x += x;
	}
	public void incrementY(int y){
		this.y += y;
	}
	//Method
	
}
