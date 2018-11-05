package Input;

import java.util.Scanner;

public class MultiplyTwoBinaryNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long binary1, binary2;
		
		System.out.print("Input the first binary number: ");
		binary1 = scanner.nextLong();
		
		System.out.print("Input the second binary number: ");
		binary2 = scanner.nextLong();
		
		
		System.out.println("Binary number is: " + binary1 * binary2);
		
	
		
	}

}
