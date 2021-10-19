

public class upperCaseTest {
	public static boolean upperCase(String usrG){

		//this is to check if the user input is correct or not
		char[] arrayChar = usrG.toCharArray();
		
		for(int i=0; i < arrayChar.length; i++){
			//if any character is not in upper case, return false
			if( !Character.isUpperCase( arrayChar[i] ))
				return false;
			}
		
		return true; 
		}
}
