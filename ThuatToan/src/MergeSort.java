
public class MergeSort {
	
	// chia đôi mảng
	
//	public static void mergeSort( int[] arr) {
//		
//		
//		int length = arr.length;
//		int middle = length/2;
//		
//		if(length<=1) return;
//		
//		int[] leftArr = new int[middle];
//		int[] rightArr = new int[length- middle];
//		
//		int j=0;
//		int i=0;
//		
//		for (; i<length;i++) {
//			if(i<middle) {
//				
//				arr[i]=leftArr[i];
//			}
//			else {
//				arr[i]=rightArr[j];
//				j++;
//			}
//		}
//		mergeSort(rightArr);
//		mergeSort(leftArr);
//		
//		merge(leftArr, rightArr, arr);
//	}
//
//	private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
//		
//		int leftSize= arr.length/2;
//		int rigthSize= arr.length- leftSize ;
//		
//		int l=0,r=0, i=0;
//		
//		while (l< leftSize && r< rigthSize) {
//			if(leftArr[l]< rightArr[r]) {
//				arr[i]=leftArr[l];
//				i++;
//				l++;
//				
//			}
//			else {
//				arr[i]=rightArr[r];
//				i++;
//				r++;
//			}
//		}
//		while(l< leftSize) {
//			arr[i]=leftArr[l];
//			i++;
//			l++;
//		}
//		
//		while(r< rigthSize) {
//			arr[i]=rightArr[r];
//			i++;
//			r++;
//		}
//		
//	}
//	
	
	// gộp 2 mảng và sắp xếp 
	
	
	
	
	

	
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
