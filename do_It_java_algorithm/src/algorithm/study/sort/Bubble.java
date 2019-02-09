package algorithm.study.sort;

public class Bubble extends AbstractPrintSort {

	@Override
	void sort(int[] arr, int begin, int end) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {

					swap(arr, j, j+1);
				}
			}
		}
		
	}

}
