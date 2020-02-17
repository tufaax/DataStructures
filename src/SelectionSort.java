
public class SelectionSort{
	public static void main(String[] args){
		
	/*
	 * 
	 * TODO Ill come back here and comment I previously studied this before
	 * 
	 * 
	 */
		
	
	  int[] intArray = {1, 3, 55, 343, 34, 34 , -66, -1, -22};

	  for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; 
			  lastUnsortedIndex--){

	  	int largest = 0;

	  	  for(int i = 1; i <= lastUnsortedIndex; i++){
	  	    if(intArray[i] > largest){
	  	    largest = i;
	  	    }
	  	  }
	  	  swap(intArray, largest, lastUnsortedIndex);
	  }

	  for(int a:intArray){
	    System.out.println(a);
	  }

	}

	public static void swap(int[] a, int i, int j){

	  if(i == j){
		return;
	  }

	  int temp = a[i];
	  a[i] = a[j];
	  a[j] = temp;
	}
}