import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Movie t = new Movie();
		String answer = "yes";
		do {
			System.out.println("Please enter the title of a movie: ");
			t.setTitle(input.nextLine());
			System.out.println("Please enter the movie's rating: ");
			t.setRating(input.nextLine());
			System.out.println("Please enter the number of tickets sold at a theater: ");
			t.setSoldTickets(input.nextInt());
			System.out.println(t.toString());
			System.out.println("Do you want to enter another movie? yes or no: ");
			answer = input.nextLine();
			answer = input.nextLine();
				
		} while(answer.equalsIgnoreCase("yes"));
		System.out.println("Goodbye");
		
		
		
		
	}

}
