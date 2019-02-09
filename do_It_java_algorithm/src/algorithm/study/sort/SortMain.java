package algorithm.study.sort;

import algorithm.study.sort.AbstractPrintSort.PrintState;

public class SortMain {

	final static int[] NUMBERS = {1,5,2,3,6,8,9,4,0};

	public static void main(String[] args) {
		
		
		System.out.println("QUICK SORT ");
		int[] quickSortNum = NUMBERS.clone();
		Quick quick = new Quick();
		quick.printArray(quickSortNum, PrintState.START);
		quick.sort(quickSortNum, 0, quickSortNum.length-1);
		quick.printArray(quickSortNum, PrintState.END);
		
		
		System.out.println("\nBUBBLE SORT ");
		int[] bubbleSortNum = NUMBERS.clone();
		Bubble bubble = new Bubble();
		bubble.printArray(bubbleSortNum, PrintState.START);
		bubble.sort(bubbleSortNum, 0, bubbleSortNum.length-1);
		bubble.printArray(bubbleSortNum, PrintState.END);
		
		System.out.println("\nINSERTION SORT ");
		int[] InsertionSortNum = NUMBERS.clone();
		Insertion insertion = new Insertion();
		insertion.printArray(InsertionSortNum, PrintState.START);
		insertion.sort(InsertionSortNum, 0, InsertionSortNum.length-1);
		insertion.printArray(InsertionSortNum, PrintState.END);
	}
}
