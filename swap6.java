import java.util.Scanner;

class swap6 {
	// user defined instance variable (Using 3 variables)
	int a, b, c;
	public static void main (String args[]) {
		// Create object for input
		Scanner input = new Scanner(System.in);
		// object for instance variable
		swap6 val = new swap6();
		
		System.out.println("Enter First Number : ");
		// take input
		val.a = input.nextInt();
		System.out.println("Enter Second Number : ");
		val.b = input.nextInt();
		
		// printing values before swapping
		System.out.println("Before");
		System.out.println("a = "+ val.a);
		System.out.println("b = "+ val.b);
		
		// Swapping
		val.c = val.a;
		val.a = val.b;
		val.b = val.c;
		// printing values after swapping
		System.out.println("After");
		System.out.println("a = "+ val.a);
		System.out.println("b = "+ val.b);
	}
}