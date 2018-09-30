package Input;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = inputScanner.nextInt();
		
		System.out.print("input second number: ");
		int num2 = inputScanner.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		

	}

}
