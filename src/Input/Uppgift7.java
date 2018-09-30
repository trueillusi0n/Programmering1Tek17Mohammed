package Input;

import java.util.Scanner;

public class Uppgift7 {

	public static void main(String[] args) {
		
		
	int a, b, c;
	Scanner in = new Scanner (System.in);
	
	System.out.print("Input first number: ");
	a = in.nextInt();
	
	System.out.print("input second number: ");
	b = in.nextInt();
	
	c = a;
	a = b;
	b = c;
	
	System.out.println("Swaped values are: " + a + " and " + b);
	

	}

}
