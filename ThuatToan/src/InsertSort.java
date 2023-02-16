
public class InsertSort {

	public static void insertSort(int[] array) {
//		for(int i =1; i< array.length;i++ ) {
//			int temp= array[i];
//			int j= i-1;
//			
//			while(j>=0 && array[j] > temp) {
//				array[j+1]= array[j];
//				j--;
//			}
//			array[j+1]=temp;
//		}
		
		
		for (int i=1; i<array.length;i++) {
			int j= i-1;
			int temp= array[i];
			while(j>=0 && array[j]>temp) {
				array[j+1]= array[j];
				j--;
			}
			array[j+1]= temp;
		}
	}
}
