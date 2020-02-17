
public class ShellSort {
	public static void main(String[] args) {
		/*
		 * --- Things to know ^( '-' )^
		 * 
		 * 1. As the algorithm progresses, the gap is reduced
		 * 
		 * 2. The last gap value is always 1
		 * 
		 * 3. So, the algorithm does some preliminary work (using gap values greater than 1),
		 * 
		 * and then becomes insertion sort
		 * 
		 * 
		 * 4. By the time we get to insertion sort, 
		 * the array has been partially sorted therefore less shifting
		 * 
		 * 
		 * --- Knuth Sequence (″･ิ_･ิ)っ
		 *   + Gap is calculated using (3^k - 1) / 2
		 *   
		 *   + We set k based on the length of the array
		 *   
		 *   + We want the gap to be as close as possible to the length of array.
		 *   
		 *   + We will base out gap on array.length / 2. For example if the length of the 
		 *   array was 7. There would only be 2 iterations.
		 *   
		 *   
		 * --- Shell Sort (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
		 *   + In place algorithm
		 *   + Depends on the gap. However, worst case is quadratic o(n^2)
		 *   + Unstable algorigthm - (-＿- )ノ
		 *   + Doesn't require as much shifting as insertion sort since it is presorted.
		 *   
		 * 
		 */
		
		int[] intArray = {20, 35, -15, 7, 55, 1 -22};
		
		for(int gap = intArray.length / 2; gap > 0; gap /= 2) {
			
			for( int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				
				int j = i;
				
				while(j >= gap && intArray [j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				
				intArray[j] = newElement;
				
			}
		}
		
		for(int a:intArray) {
			System.out.print(a + " ");
		}
	}

}
