

	import java.util.Scanner;

	public class GreaterNumberFinderr {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        double number1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number2 = scanner.nextDouble();

	        
	        System.out.print("Enter the third number: ");
	        double number3 = scanner.nextDouble();

	        
	        double greatestNumber;
	        if (number1 >= number2 && number1 >= number3) {
	            greatestNumber = number1;
	        } else if (number2 >= number1 && number2 >= number3) {
	            greatestNumber = number2;
	        } else {
	            greatestNumber = number3;
	}   
	scanner.close();
	}
}
