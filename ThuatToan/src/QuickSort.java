
public class QuickSort {
	
	
	public static void quickSort(int[] arr, int start, int end) {
		if(end<start) return;
		
		int priviot = priviot(arr,start, end);
		quickSort(arr, start, priviot-1);
		quickSort(arr,priviot+1 ,end );
		
	}

	private static int priviot(int[] arr, int start, int end) {
		
		int j= start -1 ;
		
		int priviot = arr[end];
		 
		for (int i=start; i<end;i++) {
			if(arr[i]< priviot) {
				j++;
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		j++;
		int temp = arr[j];
		arr[j]= arr[end];
		arr[end]= temp;
		
		return j;
	}
	
//	// chon 1 phan tu lamf chot
//
//	public static void quickSort(int[] array,int start,int end) {
//		if(end<= start)
//			return;// base case
//		 
//		int priviot = priviot( array,start, end);
//		quickSort(array,start, priviot-1 );// sắp xếp nửa bên trái 
//		quickSort(array,priviot+1, end);// sắp xếp nửa bên phải  
//	}
//	
//	public static int priviot(int[] array,int start,int end) {
//		
//		int priviot= array[end];
//		
//		int i = start -1;
//		
//		for (int j= start; j<=end-1;j++) {
//			if(array[j]<priviot) {
//				i++;
//				int temp = array[i];
//				array[i]= array [j];
//				array[j]= temp;
//				
//			}
//		}
//		i++;
//		int temp= array[i];
//		array[i]=array[end];
//		array[end]=temp;
//		
//		return i ;
//	}
	
	
}
