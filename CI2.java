class CI2 {
	// predefined instance variable
	float p = 5000f, r = 3.5f, t = 3f;
	public static void main(String args[]){
		CI2 val = new CI2();
		
		float temp = 1 + (val.r/100);
		float comp_Int = val.p*((temp*temp*temp)-1);

		System.out.println(comp_Int);
	}
}