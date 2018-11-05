package Variabler;

import java.util.Scanner;

public class NumberOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner inputscanner = new Scanner(System.in);

		System.out.print("Input a integer number: ");
		int num = inputscanner.nextInt();

		
		int max = num;
		for (int i = 2; i < max; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if( i % j == 0) {
					prime = false;
				}
			}
			if (prime == true)
				System.out.print(i + " ");
		} 
	}
}
