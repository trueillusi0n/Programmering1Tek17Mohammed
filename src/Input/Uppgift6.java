package Input;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		final double width = 5.6;
		final double height = 8.5;
		
		double perimeter = 2*(width + height);
		double area = width * height;
		
		
		
		System.out.println("Arena is 5.6 * 8.5 = " + area);
		System.out.print("Area is:" + width * height);
	
		System.out.println("Perimeter is 2*(5.6 + 8.5) = " + perimeter);
		
	
	
	}

}
