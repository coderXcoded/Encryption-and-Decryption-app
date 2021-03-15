import java.util.Scanner;

public class Decrypter {
	
	private int numberToDecrypt;
	private String decryptedString;
	
	//Constructor
	public Decrypter(int numberToDecypher) {
		this.numberToDecrypt = numberToDecypher;
	}
	
	//set decryptedString 
	public void setDecryptedString () {
		
		//Convert it to String
		String stringDecrypt = String.valueOf(numberToDecrypt);
		
		//Convert to Character Array
		char[] charDecrypt = stringDecrypt.toCharArray();
		
		//Access each value of the String and do the math
		int firstNumber = Character.getNumericValue(charDecrypt[0]);
		firstNumber = ((firstNumber + 10) -7) % 10;
		
		int secondNumber = Character.getNumericValue(charDecrypt[1]);
		secondNumber = ((secondNumber + 10) -7) % 10;
		
		int thirdNumber = Character.getNumericValue(charDecrypt[2]);
		thirdNumber = ((thirdNumber + 10) -7) % 10;
		
		int fourthNumber = Character.getNumericValue(charDecrypt[3]);
		fourthNumber = ((fourthNumber + 10) -7) % 10;
		
		//Swap positions in decrypted Number
		String decryptedNumber = String.valueOf(thirdNumber) + String.valueOf(fourthNumber) +
				String.valueOf(firstNumber) + String.valueOf(secondNumber);
		
		this.decryptedString = decryptedNumber;
	
	}
	
	//getDecryptedString
	public String getDecryptedString() {
		setDecryptedString();
		return decryptedString;
	}
	
}
