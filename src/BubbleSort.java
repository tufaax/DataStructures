
public class BubbleSort {

	public static void main(String[] args) {
		/*
		 * -- Bubble Sort
		 *   + Common first algo to learn. However not used alot
		 *   + Time complexity: O(n^2) 〴⋋_⋌〵
		 *   +The biggest number will bubble up to the  end of the array
		 *   +In place array （ミ￣ー￣ミ）
		 * 
		 */
		
		int[] intArray = {20, 35, -15, 7, 55, 1 -22};
		
		bubbleSort(intArray);
		
		for(int a:intArray) {
			System.out.print(a+ " ");
		}
		
		

	}
	public static void bubbleSort(int[] a) {
		boolean needNextPass = true;
		for(int k = 1;k < a.length && needNextPass;k++) {
			needNextPass = false;
			for(int i = 0;i < a.length - k;i++){
				if(a[i] > a[i+1]) {
				swap(a, i, i+1);
				needNextPass = true;
				}
			}
			
		}
		
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
