package algorithm.study.sort;

public class Insertion extends AbstractPrintSort {

	@Override
	void sort(int[] arr, int begin, int end) {
		
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j-1]>arr[j]) {
				swap(arr, j-1, j);
				j--;
			}
			
		}
	}

}
