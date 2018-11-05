package Variabler;

import java.util.Scanner;

public class OneIs15 {

	public static void main(String[] args) {
		Scanner inputscanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = inputscanner.nextInt();
		
		System.out.print("Input second number: ");
		int num2 = inputscanner.nextInt();
		
		if (num1 == 15 || num2 == 15 || num1+num2 == 15 || num1-num2 == 15) 
			System.out.println("true");

		
		}
		
	}


