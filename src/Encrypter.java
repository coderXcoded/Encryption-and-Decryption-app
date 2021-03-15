
public class Encrypter {
	
	private int userInput;
	private String encryptedNumber;

	//Constructor function 
	public Encrypter(int number){
		this.userInput = number;
	}
	
	//get userInput private variable
	public int getUserInput() {
		return userInput;
	}
	
	//set userInput private variable
	public void setUserInput(int uInput) {
		this.userInput = uInput;
	}
	
	//set 
	public void encryptNum (){
		
		//Convert num to String
		String uInput = String.valueOf(userInput);
		
		//Convert String to Character Array
		char[] charArrayUInput = uInput.toCharArray();
		
		//Encrypt first number
		int firstNumber = Character.getNumericValue(charArrayUInput[0]);
		firstNumber += 7;
		firstNumber %= 10;
		
		//Encrypt second number
		int secondNumber = Character.getNumericValue(charArrayUInput[1]);
		secondNumber += 7;
		secondNumber %= 10;
		
		//Encrypt 3rd number
		int thirdNumber = Character.getNumericValue(charArrayUInput[2]);
		thirdNumber += 7;
		thirdNumber %= 10;
		
		//Encrypt fourth number
		int fourthNumber = Character.getNumericValue(charArrayUInput[3]);
		fourthNumber += 7;
		fourthNumber %= 10;
		
		//Concatenate Encrypted numbers in given algorithmic order
		String stringEncNum = String.valueOf(thirdNumber) + String.valueOf(fourthNumber) + String.valueOf(firstNumber) + String.valueOf(secondNumber);
		
		//Set encryptedNumber
		this.encryptedNumber = stringEncNum;
	}
	
	//get Encrypted number
	public String getEncryptedNumber(){
		encryptNum();
		return encryptedNumber;
	}
	
	
	
}
