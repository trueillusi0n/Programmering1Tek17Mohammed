package Input;

import java.util.Scanner;

public class Uppgift5 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = inputScanner.nextInt();
		System.out.print("Input second number: ");
		int num2 = inputScanner.nextInt();
		System.out.print("Input third: ");
		int num3 = inputScanner.nextInt();
		
		System.out.println((num1 + num2 + num3)/3);

	}

}
