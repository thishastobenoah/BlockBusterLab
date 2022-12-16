import java.util.Scanner;

public class VHS extends Movie {
	private int currentTime = 0;
	
	@Override
	public String toString() {
		return "VHS [currentTime=" + currentTime + "]";
	}
	public int getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	public VHS(String title, int runTime) {
		super(title, runTime);
		
	}
	@Override
	public void play() {
		Scanner scnr = new Scanner (System.in);
		char loopResponse;
	
		do {
		System.out.println(scenes.get(currentTime));
		currentTime++;
		if (currentTime == scenes.size()) {
			rewind();
		}
		System.out.print("Watch Another Scene?(Y/N):");
		loopResponse  = scnr.next().charAt(0);
	}while (loopResponse == 'y'|| loopResponse == 'Y');
		System.out.println("Bye!");
		scnr.close();
	}
	public void rewind() {
		currentTime = 0;
	}

}
