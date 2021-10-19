
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class guesses {
	//this checks the guesses and generates the answer
	public static void guesses(int usrR, int usrC,ArrayList<String> arrayCode) {
		int usrCa = usrC-1, usrA = usrC-1;
		ArrayList<String> arrayCorrect = new ArrayList<String>();
		//this is to generate a correct checker for arrayGuessCheck
		for (int t = usrC; t>0 ; t--) {
			//this is to generate a correct guesses for the number of elements in user code
			arrayCorrect.add("+");
		}
		
		while (Mastermind.guessNo != 13) {
		
			ArrayList<String> arrayGuessCheck = new ArrayList<String>();
			
			Scanner usrIn= new Scanner(System.in);
			System.out.println("guess the sequence with no spaced and all captital");
			String usrG= usrIn.nextLine();
			
			if (usrG.length()==usrC) {
				if (upperCaseTest.upperCase(usrG)) {
					String[] arrayGuess = usrG.split("");
					//splits the guess into and array to be compared with the arrayCode
					System.out.println(Arrays.toString(arrayGuess));
					for (int i = usrCa; i>=0; i--) {
						for (int j = usrA; j>=0; j--) {
							if (arrayCode.get(i).equals(arrayGuess[j])&& i == j) {
								arrayGuessCheck.add("+");
							}
						}
					}
					for (int i = usrCa; i>=0; i--) {
						for (int j = usrA; j>=0; j--) {
							if (arrayCode.get(i).equals(arrayGuess[j]) && i != j) {
								arrayGuessCheck.add("-");
							}
						}
					}
				}
				else {
					//checks if its the answer is in correct format
					System.out.println("Please enter in CAPITALS and only letters");
					guesses(usrR,usrC,arrayCode);
				}
			}
			else {
				System.out.println("Your guess contained too many elements or too little!");
				guesses(usrR,usrC,arrayCode);
			}
			if (arrayGuessCheck.equals(arrayCorrect)) {
				//prints the guesses
				System.out.println("Guess Number = " + Mastermind.guessNo);
				System.out.println(arrayGuessCheck + " Congratulations you guessed the Code!");
				break;
			}
			System.out.println(arrayGuessCheck);
			System.out.println("Guess Number = " + Mastermind.guessNo);
			Mastermind.guessNo++;
			if (Mastermind.guessNo == 13) {
				//this checks if the user ran out of guesses
				System.out.println("You have run out of Guesses");
				System.out.println("The answer was: "+ arrayCode);
				Mastermind.guessNo=1;
				restart.replay();
			}
			
			}
		score.userScore(usrR,usrC,Mastermind.guessNo,Mastermind.arrayHighscore);
		}
}

