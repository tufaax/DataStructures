
public class MergeSort {
	public static void main(String[] args) {
		/*
		 * Before I start commenting I gotta say holy crap
		 * I'm like omg this about to get cray cray ôヮô
		 * 
		 * 	-- Merge Sort (Splitting Phase)
		 * 	+ Start with an unassorted array. Afterwards, the array will be split into 
		 * 	two arrays. The proccess will continue until there are one element arrays.
		 * 
		 * -- Merge Sort (Merging Phase)
		 * + Left and right pair of arrays will sort into 2 element arrays and so one.
		 * until there is one sorted array.
		 * 
		 * + Not in place sort. This is done through temporary arrays. ಥ_ಥ
		 * 
		 * +Left side of the array will be sorted first
		 * 
		 * --Merging Sort
		 * + Not an in-place sort - bad for memory
		 * + O(nlogn) - base 2. We're repeatedly dividing the array in half suring the splitting phase
		 * + Stable algorithm
		 * 
		 */
		
		// This is the array that needs to be sorted
		int[] intArray = {20, 35, -15, 7, 55, 1 -22};
		
		
		
		
		// This enhanced for loop 
		for(int a:intArray) {
			System.out.print(a + " ");
		}
		
		
	}

}
