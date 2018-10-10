package Variabler;

import java.util.Scanner;

public class RoundedFloatValue {

	public static void main(String[] args) {
		
		Scanner inputscanner = new Scanner(System.in);
		
		System.out.print("Input an float value of number: ");
		double num = inputscanner.nextInt();
		
		System.out.println(Math.ceil(num));
 		
		
		double value = 23.5234561;
		System.out.println(Math.ceil(value));
		
	
	}

}
