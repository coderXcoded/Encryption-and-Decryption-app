import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){
		System.out.println("Welcome to my Encryption and decryption App! \n\n");
		System.out.printf("%s%n%s%n%s%n", "Do you want to Encrypt or Decrypt the Number ","1. Encrypt", "2. Decrypt");
		
		Scanner input = new Scanner(System.in);
		//For Encrypter
		int userInput = input.nextInt();
		
		if(userInput == 1) { 
			
			System.out.println("Enter the four digit numbr to Encrypt: ");
			
			int encryptThis = input.nextInt();

			Encrypter encrypted1 = new Encrypter(encryptThis);
			String encryptionOutput = encrypted1.getEncryptedNumber();
			
			System.out.println("Encrypted number is " + encryptionOutput);
		}	
		
		// For Decrypter
		if(userInput == 2) { 
			
			System.out.println("Enter the four digit numbr to decrypt: ");
			
			int decryptThis = input.nextInt();
			
			Decrypter decrypted1 = new Decrypter(decryptThis);
			String decrptionOutput = decrypted1.getDecryptedString();
			
			System.out.println("Decrypted number is " + decrptionOutput);				
			
		}
	}
}
