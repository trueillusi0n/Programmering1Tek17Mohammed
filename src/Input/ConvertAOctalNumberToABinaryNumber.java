package Input;

import java.util.Scanner;

public class ConvertAOctalNumberToABinaryNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input any octal number: ");
		String octal = scanner.next();
		
		int binary = Integer.toOctalString(octal,8);
		
		
		
		

	}

}
