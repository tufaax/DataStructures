
public class InsertionSort {
	public static void main(String[] args) {
		/*
		 * In place algorithm ('ω^＼)
		 * 
		 * 0(n^2) time complexity - quadratic (┛◉Д◉)┛彡┻━┻ 
		 * 
		 * it will take 100 steps to sort 10 items ôヮô 
		 * 
		 * Stable algorithm - everything is literally in order ＼(￣▽￣)/
		 */
		
		int[] intArray = {20, 35, -15, 7, 55, 1 -22};
		
		for(int firstUnsortedIndex = 1;firstUnsortedIndex < intArray.length;
		firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];
			// We will use this i outside the following loop
			int i;
			
			for(i = firstUnsortedIndex;i > 0 && intArray[i - 1] > newElement;i--) {
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;
		}
		
		for(int a:intArray) {
			System.out.print(a + " ");
		}
		
		
	}

}
