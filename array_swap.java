class array_swap {
	// function to print array
	static void printArray(int[] arr) {
		for(int i = 0; i<6; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// function to swap array
	static void swapArray(int[] arr1, int[] arr2) {
		int temp;
		for(int i = 0; i<6; i++) {
			temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {7,8,9,10,11,12};	
		
		//printing array before swapping 
		System.out.println("Before Swapping : ");
		System.out.println("Array 1 : ");
		printArray(arr1);
		System.out.println("Array 2 : ");
		printArray(arr2);
		
		// swapping the array
		swapArray(arr1, arr2);
		
		//printing array After swapping 
		System.out.println("After Swapping : ");
		System.out.println("Array 1 : ");
		printArray(arr1);
		System.out.println("Array 2 : ");
		printArray(arr2);
	}
}