import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		VHS vhs1;
		vhs1  = new VHS ("Jumanji", 104);
		vhs1.getScenes().add("Scene 1");
		vhs1.getScenes().add("Scene 2");
		vhs1.getScenes().add("Scene 3");
		movies.add(vhs1);
		VHS vhs2;
		vhs2  = new VHS ("Titanic", 194);
		vhs2.getScenes().add("Scene 1");
		vhs2.getScenes().add("Scene 2");
		vhs2.getScenes().add("Scene 3");
		movies.add(vhs2);
		VHS vhs3;
		vhs3  = new VHS ("Home Alone", 103);
		vhs3.getScenes().add("Scene 1");
		vhs3.getScenes().add("Scene 2");
		vhs3.getScenes().add("Scene 3");
		movies.add(vhs3);
		DVD dvd1;
		dvd1 = new DVD ("Avatar", 161);
		dvd1.getScenes().add("Scene 1");
		dvd1.getScenes().add("Scene 2");
		dvd1.getScenes().add("Scene 3");
		movies.add(dvd1);
		DVD dvd2;
		dvd2 = new DVD ("Avengers", 143);
		dvd2.getScenes().add("Intro");
		dvd2.getScenes().add("Middle");
		dvd2.getScenes().add("Ending");
		movies.add(dvd2);
		DVD dvd3;
		dvd3 = new DVD ("Mr. Magorium's Wonder Emporium", 100);
		dvd3.getScenes().add("Scene 1");
		dvd3.getScenes().add("Scene 2");
		dvd3.getScenes().add("Scene 3");
		movies.add(dvd3);
		//////////////////////////////////////////////////////////////////////////////////////
		

		Scanner scnr = new Scanner (System.in);
		System.out.println("Welcome to GC BlockBuster!");
	
		for (Movie movie : movies) {
			System.out.println((movies.indexOf(movie) + 1) + ")" + movie.getTitle());
		}
		System.out.print("Please select a movie you want to watch:");
		int userInput = scnr.nextInt();
		Movie movieSelection = movies.get(userInput - 1);
		movieSelection.printInfo();
		System.out.println("Do you want to watch the movie?");
		char userResponse = scnr.next().charAt(0);
		if  (userResponse == 'y' || userResponse == 'Y') {
			movieSelection.play();
		}else {
			System.out.println("Bye!");
		}
		scnr.close();
		
		
	}

}
