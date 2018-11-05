package funktion;

import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		AverageOfThree(input());
	}
	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.print("Input the first number: ");
		inputs[0] = scanner.nextInt();
		System.out.print("Input the second number: ");
		inputs[1] = scanner.nextInt();
		System.out.print("Input the third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}
	
	
	public static void AverageOfThree(int[] inputs) {
		
				System.out.println("The average value is " + (inputs[0]+inputs[1]+inputs[2])/3);
				}
			}
			
		

