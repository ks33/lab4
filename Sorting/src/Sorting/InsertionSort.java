package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		
    	if(unsortedArray.length == 0)
    		return unsortedArray;
    	
    	//int first = max;
    	boolean unsorted = true;
    	for (int i = 0; i < unsortedArray.length; i++){
    		for(int j = 0; j < i; j ++){
    			int n = unsortedArray[i];
    			int k = unsortedArray[j];
    			if(n < k){
    				int n1 = n;
    				unsortedArray[i] = k;
    				unsortedArray[j] = n;
    			}
    		}
    	}

        return unsortedArray;
	}
}
