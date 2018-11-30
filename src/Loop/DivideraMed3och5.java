package Loop;

public class DivideraMed3och5 {

	public static void main(String[] args) {
		
		System.out.println("Divided by 3: ");
		for (int i=1; i<100; i++) {
			if (i % 3==0)
				System.out.print(i + ", ");
		}
			
		System.out.println("\nDivided by 5: ");
		for (int i=1; i<100; i++) {
			if (i % 5==0)
				System.out.print(i + ", ");
		}
		
		System.out.println("\nDivided by 3 & 5: ");
		for (int i=1; i<100; i++) {
			if (i % 3==0 && i%5==0)
				System.out.print(i + ", ");
		}
		
		
		
		/*
		for (int i =1; i < 100; i++) {
			
			if (i % 3 == 0) {
				System.out.println("Divided by3 :");
				System.out.println(i);
			}
			 
		 	if (i % 5 ==0 ) {
		       System.out.println("Divided by 5: " + i);
			}
		}
		*/
	}

	}

