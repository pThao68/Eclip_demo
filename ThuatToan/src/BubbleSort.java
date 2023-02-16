
public class BubbleSort {
	
	public void sort(int[] array) { 
		
//		for(int j=0;j< array.length-1; j++) {
//			for (int i=0; i< array.length-j-1; i++) {
//				if(array[i]>array[i+1]) {
//					int temp = array[i];
//					array[i]=array[i+1];
//					array[i+1]=temp;
//				}
//			}
//			
//		}
		
		for (int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if (array[j]< array[j+1]) {
					int temp= array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
				}
			}
		}
		
		
	}

}
