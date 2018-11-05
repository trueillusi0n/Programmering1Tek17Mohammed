package Input;

import java.util.Scanner;

public class DecimalNumberToOctalNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int decimalnum;
		System.out.print("Input a Decimal Number: ");
		decimalnum = scanner.nextInt();
		
		System.out.print("Octal number is: " +Integer.toOctalString(decimalnum));
		
		
	
		
		
	}

}
