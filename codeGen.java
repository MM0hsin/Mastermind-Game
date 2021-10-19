
import java.util.ArrayList;

public class codeGen {
	//this randomly generates the code and the range
	public static void code(int usrR, int usrC, ArrayList<String> arrayCode) {

		int indexR = usrR,  usrCindex = (usrC-1), rand;
		//all of the available options
		String[] arrayColors = {"R", "G", "B", "Y", "O", "M", "T", "V", "P", "C"};
		ArrayList<String> arrayRange = new ArrayList<String>();
		//gets the length of the arrayRange to check for repeats in the codes later on
		int aRcardin = arrayRange.size();
		while (indexR != 0) 
		{
			rand = (int) (Math.random()*((10-1)+1)+1);
			//code doesnt work when acardin equals zero so i need an initial value
			if (aRcardin == 0) {
				arrayRange.add(arrayColors[rand-1]);
				indexR--;
				aRcardin++;
			}
			else 
			{
				//this checks is there are repeats and geneerates the range
				for (int i = aRcardin; i > 0; i--) 
				{
					if (!arrayRange.contains(arrayColors[rand-1])) 
					{
						arrayRange.add(arrayColors[rand-1]);
						indexR--;
					}
				}
			}
		}
		System.out.println("Your range of colours to guess from are "+arrayRange);

		while (usrCindex != 0) {
			//this is the same as the range but smaller parameters
			aRcardin = arrayCode.size();
			rand = (int) (Math.random()*(((usrR-1)-1)+1)+1);
			if (aRcardin ==0) {
				arrayCode.add(arrayRange.get(rand));
				aRcardin++;
			}
			else {
				for (int i = aRcardin; i > 0; i--) {
					if (!arrayCode.contains(arrayRange.get(rand))) {
						arrayCode.add(arrayRange.get(rand));
						usrCindex--;
						}
					}
				}
			}
		//System.out.println(arrayCode + " code"); this is to check
		guesses.guesses(usrR,usrC,arrayCode);
	}
}
