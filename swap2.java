class swap2 {
	Pre-defined instance variable (using 3 variables)
	int a = 10, b = 20, c;
	public static void main (String args[]) {
		// creating object for instance variables
		swap2 val = new swap2();
		
		// printing values before swapping
		System.out.println("Before");
		System.out.println("a = "+ val.a);
		System.out.println("b = "+ val.b);
		
		// swapping   
		val.c = val.a;
		val.a = val.b;
		val.b = val.c;
		// printing values after swapping
		System.out.println("After");
		System.out.println("a = "+ val.a);
		System.out.println("b = "+ val.b);
	}
}