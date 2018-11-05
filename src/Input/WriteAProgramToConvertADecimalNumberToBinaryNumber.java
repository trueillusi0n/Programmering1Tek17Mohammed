package Input;

import java.util.Scanner;

public class WriteAProgramToConvertADecimalNumberToBinaryNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Input a decimal number: ");
		num = scanner.nextInt();
		
		System.out.println("Binary number is: " + Integer.toBinaryString(num));
	}

}
