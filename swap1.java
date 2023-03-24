class swap1 {
	public static void main (String args[]) {
		// Pre-defined loacal variable (using 3 variables)
		int a = 10, b = 20, c;
		
		// printing values before swapping
		System.out.println("Before");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		// swapping
		c = a;
		a = b;
		b = c;
		// printing values after swapping
		System.out.println("After");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}