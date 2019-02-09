package algorithm.study.sort;

public class Quick extends AbstractPrintSort{
	
	// 임의로 고른 원소 피벗(pivot) 
	// 피벗보다 작은 것은 피벗의 왼쪽, 큰것은 피벗의 오른쪽. 
	// 분할 > 정복 > 결합
	// 최선, 평균 : nlog2n  최악: n^2
	
	// 구현 간단 비효율적 : 삽입, 선택, 버블
	// 복잡하지만 효율적인 방법 : 퀵정렬, 힙정렬, 합병 정렬, 기수정렬
	
	@Override
	public void sort(int arr[], int begin, int end) {
		
		if(begin<end) {
			int partitionIndex = partition(arr, begin, end);
			
			sort(arr, begin, partitionIndex-1);
			sort(arr, partitionIndex +1, end);
			
		}
	}

	private int partition(int[] arr, int begin, int end) {
		int pivot = arr[end];
		int i = (begin-1);
		
		for (int j = begin; j < end; j++) {
			if (arr[j]<=pivot) {
				i++;
				
				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j]=swapTemp;
				
			}
		}

		swap(arr, i+1, end);
		return i+1;
	}


}
