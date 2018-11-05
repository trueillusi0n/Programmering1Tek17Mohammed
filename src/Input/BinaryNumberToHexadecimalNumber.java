package Input;

import java.util.Scanner;

public class BinaryNumberToHexadecimalNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a Binary Number: ");
		String binary = scanner.next();

		int hex = Integer.parseInt(binary,2);
		
		System.out.println("hexDecial number: " + Integer.toHexString(hex));
	}

}
