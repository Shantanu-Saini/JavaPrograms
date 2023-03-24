class CI {
	public static void main(String args[]){
		float p = 5000f;
		float r = 3.5f;
		float t = 3f;
		
		float temp = 1 + (r/100);
		float comp_Int = p*((temp*temp*temp)-1);

		System.out.println(comp_Int);
	}
}