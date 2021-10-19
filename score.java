
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class score {
	public static void userScore(int usrR, int usrC, int guessNo, int[] arrayHighscore) {
		int score, i;
		score = (12-guessNo) + usrR + usrC;
		System.out.println("Your Score:"+ score +"!");
		System.out.println("HighScores:");
		//this is to store the high scores in an array 
		if (arrayHighscore[0]<score) {
			arrayHighscore[0]=score;
		}
		else if (arrayHighscore[1]<score) {
			arrayHighscore[1]=score;
		}
		else if (arrayHighscore[2]<score) {
			arrayHighscore[2]=score;
			
		}
		else if (arrayHighscore[0]<score) {
			arrayHighscore[1]=score;
		}
		else if (arrayHighscore[1]<score) {
			arrayHighscore[2]=score;	
		}
		else if (arrayHighscore[0]<score) {
			arrayHighscore[2]=score;
		}
		else if (arrayHighscore[1]<score) {
			arrayHighscore[0]=score;
		}else if (arrayHighscore[2]<score) {
			arrayHighscore[1]=score;
		}
		//this is to store the high scores into a file
		for (i = 0; i <= 2; i++) {
			try{
				PrintWriter pr = new PrintWriter("C:\\Temp\\MasterMind_Highscores\\HighScores.txt"); //entered my desktop location   
				for (int t=0; t<arrayHighscore.length ; t++){
				pr.println(arrayHighscore[i]);
				}
				pr.close();
			}
			catch (Exception e){
				e.printStackTrace();
				System.out.println("No such file exists.");
			}
			//this is to print the file
			try {
				File myObj = new File("C:\\Temp\\MasterMind_Highscores\\HighScores.txt"); //entered my desktop location
				Scanner myReader = new Scanner(myObj);
				String data = myReader.nextLine();
				System.out.println(data);
				myReader.close();
				} 
			catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
				}
		}
		restart.replay();
	}
}
