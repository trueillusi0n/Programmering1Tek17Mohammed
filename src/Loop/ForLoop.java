package Loop;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 int number = 0;
		 
		 system.out.println(number);
		 number = number +1 
		 system.out.println(number);
		 number = number;
		 system.out.println(number);
		 number++;
		 system.out.println(number);
		 */
		
		/* 
		 *for ( startnumber; finishnumber; change) {
		 *		this is where everything happends many times!
		 * }
		 */
		for (int i = 1000; i >= 800; i--)  {
			System.out.println(i);
		}
		
		boolean alive = true;
		
		for (;;) {
			if (alive == false) {
				break;
			}
		}

	}

}
