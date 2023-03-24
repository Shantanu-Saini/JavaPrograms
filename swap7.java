import java.util.Scanner;

class swap7 {
	public static void main (String args[]) {
		// user defined local variable (Using 2 variables)
		int a, b;
		
		// creating object for input
		Scanner input = new Scanner(System.in);
		
		// take input
		System.out.println("Enter First Number : ");
		a = input.nextInt();
		System.out.println("Enter Second Number : ");
		b = input.nextInt();
		
		// printing values before swapping
		System.out.println("Before");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		// swapping
		b = a + b;
		a = b - a;
		b = b - a;
		// printing values after swapping
		System.out.println("After");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}