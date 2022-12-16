import java.util.Scanner;

public class DVD extends Movie{

	public DVD(String title, int runTime) {
		super(title, runTime);
		
	}

	@Override
	public void play() {
		Scanner scnr = new Scanner (System.in);
		char loopResponse;
		do {
		this.printScenes();
		System.out.println("Which scene would you like to play?:");
		int  userInput = scnr.nextInt();
		scnr.nextLine();
		System.out.println(scenes.get(userInput));
		System.out.print("Watch Another Scene?(Y/N):");
		loopResponse  = scnr.next().charAt(0);
	}while (loopResponse == 'y'|| loopResponse == 'Y');
		System.out.println("Bye!");
		scnr.close();
	}

}
