package funktion;

import java.util.Scanner;

public class Uppgift1Funktioner {

	public static void main(String[] args) {
		int[] input = input();
		smallestAmongThree(input);
		largestAmongThree(input);
	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.print("Input the first number: ");
		inputs[0] = scanner.nextInt();
		System.out.print("Input the Second number: ");
		inputs[1] = scanner.nextInt();
		System.out.print("Input the third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}

	public static void smallestAmongThree(int[] inputs) {
		int tempVar;
		if (inputs[0] < inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
		}
		System.out.print("The smallest value is ");
		if (tempVar < inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}

	}

	public static void largestAmongThree(int[] inputs) {
		int tempVar;
		if (inputs[0] > inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
		}
		System.out.print("The largest value is ");
		if (tempVar > inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}
	}

}
