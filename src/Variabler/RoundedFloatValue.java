package Variabler;

import java.util.Scanner;

public class RoundedFloatValue {

	public static void main(String[] args) {
		
		Scanner inputscanner = new Scanner(System.in);
		
		System.out.print("Input an float value of number: ");
		double num = inputscanner.nextFloat();
		
		System.out.println(Math.round(num));
 		
		
		
	
	}

}
