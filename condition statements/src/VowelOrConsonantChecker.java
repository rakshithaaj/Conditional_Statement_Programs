

	import java.util.Scanner;

	public class VowelOrConsonantChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char character = scanner.next().toLowerCase().charAt(0);

	        if (character >= 'a' && character <= 'z') {
	            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
	                System.out.println("The character is a vowel.");
	            } else {
	                System.out.println("The character is a consonant.");
	            }
	        } else {
	            System.out.println("Not a valid letter.");
	        }

	        scanner.close();
	    }
	}


