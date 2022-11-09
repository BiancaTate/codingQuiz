import java.util.*;
public class codingQuiz {
	
	
	public void codingQuiz () {
		String theEnd= "Thank you for taking Bianca's Coding Quiz !";
		System.out.println("Welcome to Bianca's Coding Quiz!");
		
		System.out.print("Would you like to begin?");
		
		Scanner input = new Scanner(System.in);
		String begin= input.nextLine();
		Quiz start= new Quiz(); // creating an object of Quiz class 
		
		if(begin.equalsIgnoreCase("yes")) {
			start.Quiz(); // quiz is name of method/ class that holds quiz questions 
			
		}
		else {
			System.out.println(theEnd);
		}
		

		
	
	
	}

}

