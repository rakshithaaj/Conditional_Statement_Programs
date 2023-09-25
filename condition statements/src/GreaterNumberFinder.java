

	import java.util.Scanner;

	public class GreaterNumberFinder {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        int number1=scanner.nextInt();

	        
	        System.out.print("Enter the second number: ");
	        int number2 = scanner.nextInt();

	        
	        int greaterNumber = 0;
			if (number1 > number2) {
	            greaterNumber = number1;
	        } else if (number2 > number1) {
	            greaterNumber = number2;
	        } else {
	            System.out.println("Both numbers are equal.");
	            
	        }

	        
	        System.out.println("The greater number is: " + greaterNumber);

	        
	        scanner.close();
	    }
	}

