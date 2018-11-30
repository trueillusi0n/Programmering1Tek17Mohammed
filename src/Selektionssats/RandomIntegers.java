package Selektionssats;

import java.util.Scanner;

public class RandomIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the sarting number of the range: ");
		int Snum = scanner.nextInt();
		System.out.print("Input the ending number of the range: ");
		int Enum = scanner.nextInt();
		
		int random_num = Snum + (int)(Math.random() * ((Enum - Snum) + 1));
		System.out.println(random_num);

	}

}
