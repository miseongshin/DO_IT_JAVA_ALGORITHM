package algorithm.study.sort;

public abstract class AbstractPrintSort {

	abstract void sort(int arr[], int begin, int end) ;
	enum PrintState {
		START , END, CHANGED
	}
	
	void printArray(int[] arr, PrintState printState) {
		
		if (printState != null) {
			System.out.print(printState.name()+":");
		}
		
		
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	void swap(int[] arr, int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		printArray(arr, PrintState.CHANGED);
	}

	
}
