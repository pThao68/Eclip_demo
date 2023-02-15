
public class MergeSort {
	
	public static void mergeSort(int[] arr) {
		
		int length = arr.length;
		if(length <=1 )return;// base case
		
		int middle =length/2;
		int[] leftArray= new int[middle];
		int[] rigthArray= new int[length - middle];
		
		int i=0;// right
		
		int j=0;// left
		
		for(; i<length; i++) {
			if(i<middle) {
				leftArray[i]= arr[i];
			}
			else {
				rigthArray[j]= arr[i];
				j++;
			}
		}
		mergeSort(rigthArray);
		mergeSort(leftArray);
		merge(leftArray, rigthArray, arr);
	}
	
	public static void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize= array.length/2;
		int rightSize= array.length - leftSize;
		
		int i=0, l=0,r=0;// indices
		
		// check the conditions for merging
		while(l< leftSize && r< rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i]=rightArray[r];
				i++;
				r++;
			}
		}
		while(l< leftSize) {
			array[i]= leftArray[l];
			i++;
			l++;
		}
		while(r< rightSize) {
			array[i]= rightArray[r];
			i++;
			r++;
		}
	}

}
