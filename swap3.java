class swap3 {
	public static void main (String args[]) {
		// predefined local variable (Using 2 variables)
		int a = 10, b = 20;
		
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