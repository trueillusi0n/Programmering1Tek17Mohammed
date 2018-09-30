package Input;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int num1 = inputScanner.nextInt();
		
		for (int index = 1; index <=10; index++ ) {
		System.out.println(num1 * index);
		
		}
	}
}
