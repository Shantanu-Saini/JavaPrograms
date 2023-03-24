import java.util.Scanner;

class swap5 {
	public static void main (String args[]) {
		// user defined local variable (Using 3 variables)
		int a, b, c;
		// Create object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		// take input
		a = input.nextInt();
		System.out.println("Enter Second Number : ");
		b = input.nextInt();
		
		// printing values before swapping
		System.out.println("Before");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		// Swapping
		c = a;
		a = b;
		b = c;
		// printing values after swapping
		System.out.println("After");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}