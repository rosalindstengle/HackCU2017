package recyclean;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer
{
	//Variables
    Timer timer;
    private boolean go = true;
    //Variables
    
    //Constructor
    public GameTimer(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}
    //Constructor

    //Subclass to implement the timertask. 
    class RemindTask extends TimerTask {
        public void run() {
            go = false; //terminate the game. 
            System.out.println("Done!");
            timer.cancel(); //Terminate the timer thread
        }
    }
   
    //Methods
    public boolean getGo()
    {
    	return go;
    }
}