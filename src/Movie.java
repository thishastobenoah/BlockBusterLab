import java.util.ArrayList;

public abstract class Movie {
	protected String title;
	protected int runTime; //in minutes
	protected ArrayList<String> scenes = new ArrayList<>();
	
	public void printInfo() {
		System.out.println(getTitle());
		System.out.println("Runtime: " + runTime + " minutes.");
	}
	public void printScenes() {
		for (String scene : scenes) {
			System.out.println(scene + "-" + scenes.indexOf(scene));
		}
	}
	public Movie() {
		
	}

	public Movie(String title, int runTime) {
		super();
		this.title = title;
		this.runTime = runTime;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public ArrayList<String> getScenes() {
		return scenes;
	}
	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	public abstract void play();
}
