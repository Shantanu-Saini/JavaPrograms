class SI2 {
	int p = 2000;
	int t = 3;
	float r = 3.5f;
	public static void main(String args[]) {
		SI2 val = new SI2();
		
		float ans = (val.p*val.t*val.r)/100;
		System.out.println(ans);
	}
}