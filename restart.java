
import java.util.Scanner;

public class restart {
	//this asks the user if they want to replay
	public static void replay(){
		
		System.out.println("Would you like to play again? Type Y to replay or N to stop.");
		Scanner usrIn= new Scanner(System.in);
		String replay= usrIn.nextLine();
		
		if (replay.equals("Y") && upperCaseTest.upperCase(replay)) {
			inputs.usrInputs();
			}
		else if  (replay.equals("N") && upperCaseTest.upperCase(replay)) {
			System.out.println("Thank you for playing!");
			System.exit(0);
			}
		else {
			System.out.println("Please capitals only and Y or N!");
			replay();
			}
			
		}
}
