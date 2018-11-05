package Input;

import java.util.Scanner;

public class BinaryNumberToAOctalNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a Binary Number: ");
		String binary = scanner.next();

		int octal = Integer.parseInt(binary,2);
		
		System.out.println("Octal number: " + Integer.toOctalString(octal));

	}

}
