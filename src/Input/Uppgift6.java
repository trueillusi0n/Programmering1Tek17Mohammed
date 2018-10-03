package Input;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		final double width = 5.6;
		final double height = 8.5;
		
		double perimeter = 2*(width + height);
		double area = width * height;
		
		
		
		
		System.out.println("Area is:" + width + " x " + height + " = " + (width * height));
		
	
		System.out.println("Perimeter is: " + perimeter + " x " + height + " = " + (width * height));
		
	
	
	}

}
