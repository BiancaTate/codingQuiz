import java.util.*;

public class Quiz {   /// class to hold questions and answers and ask user if they would like to continue
	
	

	public void Quiz() {  // method for Quiz class 
		
	Scanner input = new Scanner(System.in);
	int right=0;
	int wrong=0;
	String test;
	
	
	
	

	System.out.println("Type the word \"stop\" at any time to exit the quiz");
	System.out.println();

	
	String q1=("What color is the sky?");
	System.out.print(q1);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	} else if (test.equalsIgnoreCase("blue")) {
		System.out.println("Correct! + 5 points");
		right ++;
	}
		else {
		System.out.println("Incorrect - 2 points");
		wrong ++;
	}
	
	String q2=("What is the first letter of the alphabet ?");
	System.out.print(q2);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
	else  if (test.equalsIgnoreCase("a")) {
		System.out.println("Correct! + 5 points");
		right ++;
	}
	else {
		System.out.println("Incorrect - 2 points");
		wrong ++;
	}


	
	String q3=("What is the last letter of the alphabet ?");
	System.out.print(q3);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
	else if (test.equalsIgnoreCase("z")) {
		System.out.println("Correct! + 5 points");
		right ++;
		}
	else {
		System.out.println("Incorrect - 2 points");
		wrong ++;
		}
	String q4=("How many days are in a week?");
	System.out.print(q4);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
	else if (test.equalsIgnoreCase("seven")) {
		System.out.println("Correct! + 5 points");
		right ++;
		}
	else {
		System.out.println("Incorrect - 2 points");
		wrong ++;
		}
	String q5=("How many continents are there?");
	System.out.print(q5);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
	else if (test.equalsIgnoreCase("seven")) {
		System.out.println("Correct! + 5 points");
		right ++;
	}
	else {
		System.out.println("Incorrect - 2 points");
		wrong ++;
		}
	String q6=("What is the name of the tallest mountain on Earth?");
	System.out.print(q6);
	input.nextLine();
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
		else if (test.equalsIgnoreCase("Mount Everest")) {
			System.out.println("Correct! + 5 points");
			right ++;
	}
		else {
			System.out.println("Incorrect - 2 points");
			wrong ++;
	}
	String q7=("Which animal lays the largest eggs?");
	System.out.print(q7);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
		else if (test.equalsIgnoreCase("Ostrich")) {
			System.out.println("Correct! + 5 points");
			right ++;
	}
		else {
			System.out.println("Incorrect - 2 points");
			wrong ++;
	}
	String q8=("What is the name of a shape with 5 sides?");
	System.out.print(q8);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);}
		else if (test.equalsIgnoreCase("Pentagon")) {
			System.out.println("Correct! + 5 points");
			right ++;
	}
		else {
			System.out.println("Incorrect - 2 points");
			wrong ++;
	}
	String q9=("In which country can you find the Eiffel Tower?");
	System.out.print(q9);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
	else if (test.equalsIgnoreCase("France")) {
			System.out.println("Correct! + 5 points");
			right ++;
	}
		else {
			System.out.println("Incorrect - 2 points");
			wrong ++;
	}
	String q10=("What is the orange part of an egg called?");
	System.out.print(q10);
	test = input.nextLine();
	if (test.equalsIgnoreCase("stop")) {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
		System.exit(0);
	}
		if (test.equalsIgnoreCase("Yolk")) {
			System.out.println("Correct! + 5 points");
			right ++;
	}
		else {
			System.out.println("Incorrect - 2 points");
			wrong ++;
	}
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int correctTotal= right *(5); // every correct answer equals 5 points
	int wrongTotal= wrong * (-2); // every incorrect answer subtracts 2 points
	
	int quizTotal= correctTotal + wrongTotal;
	System.out.println();
	System.out.println("You answered " + right + " question(s) correctly");
	System.out.println("You answered " + wrong + " question(s) incorrectly");
	System.out.println();
	
	System.out.println("Your total score is "+ quizTotal);
	System.out.println();

	
	
	
		

	
	System.out.println("Would you like to take this quiz again?");
	test = input.nextLine();
	if (test.equalsIgnoreCase("yes")) {
		codingQuiz again= new codingQuiz();
		again.codingQuiz();
		
	}
	else {
		System.out.println("Thank you for taking Bianca's Coding Quiz !");
	}
	
	
	
	
	
	
	}
	}






