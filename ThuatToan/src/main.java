
public class main {
	public static void main(String[] args) {
		int[] array= {1,6,4,8,2,9};
//		QuickSort quickSort = new QuickSort();
//		
//		quickSort.quickSort(array, 0, array.length-1);
		
//		BubbleSort bubbleSort = new BubbleSort();
//		bubbleSort.sort(array);
		
//		SelectionSort selectionSort = new SelectionSort();
//		selectionSort.sort(array);
		
//		InsertSort insertSort = new InsertSort();
//		insertSort.insertSort(array);
//		
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(array);
		
		for (int i: array) {
			System.out.print(i+ " ");
		}
		
		
	}

}
