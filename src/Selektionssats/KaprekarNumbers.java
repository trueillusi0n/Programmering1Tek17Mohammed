package Selektionssats;

public class KaprekarNumbers {

	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++){
			int squared = i * i;
			int digitSum = 0;
			int digit1 = 0;
			int digit2 = 0;
			if(squared < 1000){
			digit1 = squared % 10;
			digit2 = squared / 10;
			digitSum = digit1 + digit2;
			} else if(squared < 10000) {
			digit1 = squared % 100;
			digit2 = squared / 100;
			digitSum = digit1 + digit2;
			} else if(squared < 100000){
			digit1 = squared % 1000;
			}
		}
	}
}
