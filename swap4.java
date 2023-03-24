class swap4 {
	// predefined instance variable (Using 2 variables)
	int a = 10, b = 20;
	public static void main (String args[]) {
		// creating object for instance variables
		swap4 val = new swap4();
		
		// printing values before swapping
		System.out.println("Before");
		System.out.println("a = "+ val.a);
		System.out.println("b = "+ val.b);
		
		// swapping
		val.b = val.a + val.b;
		val.a = val.b - val.a;
		val.b = val.b - val.a;
		// printing values after swapping
		System.out.println("After");
		System.out.println("a = "+ val.a);
		System.out.println("b = "+ val.b);
	}
}