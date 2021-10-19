
import java.util.ArrayList;
import java.util.Scanner;

public class inputs {
	//this functions sets up the parameters for the user inputs for the range number of elements in the coode
	public static void usrInputs() {
		ArrayList<String> arrayCode = new ArrayList<String>();
		//arrayCodeneeds to be at the start to make sure it resets to an empty array
		System.out.println("");
		System.out.println("All the colours available: R, G, B, Y, O, M, T, V, P, C \nR = Red, G= Green, B = Blue, Y = Yellow, O = Orange \nM = Maroon, T = Turquoise, V = Violet, P = Pink C = Champagne");
		System.out.println("Please input the colours you would like in the range between 6 - 10");
		Scanner usrIn= new Scanner(System.in);
		//gets usr range
		String usrRst= usrIn.nextLine();

		System.out.println("Please input number of colours you would like in the code from 3-4.");
		//gets the number of elements in the code
		String usrCst= usrIn.nextLine();

			try {
				//converts usrCst into ints from strings
				int usrR = Integer.parseInt(usrRst);
				int usrC = Integer.parseInt(usrCst);
				if (usrR > 0 && usrR <= 10 && usrC >2 && usrC < 5) {
					codeGen.code(usrR, usrC, arrayCode);
				}
				else {
					System.out.println("Error! you entered value out of range or number of colours in code above 3 or less than 4\n");
					usrInputs();
				}
			}
			catch (Exception e) {
				System.out.println("Error! Please enter integer values and only guess number of elements in the code\n");
				usrInputs();
			}
		}
}
