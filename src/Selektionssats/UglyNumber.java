package Selektionssats;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		
		boolean prime=true;
		Scanner inputscanner = new Scanner(System.in);
		System.out.print("Input an integer number: ");
		int num = inputscanner.nextInt();
		
		for (int i=2;i<num;i++) {
			
			if (num%i==0) {
				prime=false;
			}
		}
		
		if(prime==true) {
			System.out.println("It is an uglu number: ");
		} else {
			System.out.println("It is not an ugly number: ");
		}
	}

}
