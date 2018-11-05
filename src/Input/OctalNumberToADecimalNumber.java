package Input;

import java.util.Scanner;

public class OctalNumberToADecimalNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input any octal number: ");
		String octal = scanner.next();
		
		int decimal = Integer.parseInt(octal,8);
		
		System.out.print("Equivalent decimal number: " + Integer.toString(decimal));
		

	}

}
