
public class QuickSort {
	
	

	public static void quickSort(int[] array,int start,int end) {
		if(end<= start)
			return;// base case
		
		int priviot = priviot( array,start, end);
		quickSort(array,start, priviot-1 );
		quickSort(array,priviot+1, end);
	}
	
	public static int priviot(int[] array,int start,int end) {
		
		int priviot= array[end];
		
		int i = start -1;
		
		for (int j= start; j<=end-1;j++) {
			if(array[j]<priviot) {
				i++;
				int temp = array[i];
				array[i]= array [j];
				array[j]= temp;
				
			}
		}
		i++;
		int temp= array[i];
		array[i]=array[end];
		array[end]=temp;
		
		return i ;
	}
	
	
}
