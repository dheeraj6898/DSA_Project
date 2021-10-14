package com.app.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 7, 9, 1, 6, 2, 8 };
		sortArr(arr, 0, arr.length-1);
		printArr(arr);
	}

	public static void sortArr(int[] arr, int low, int high) {

		if (low <= high) {
			int piv = pivotPartition(arr, low, high);

			if (low < piv - 1) {
				sortArr(arr, low, piv - 1);
			}
			if (piv < high) {
				sortArr(arr, piv, high);
			}
		}
	}

	public static int pivotPartition(int[] arr, int low, int high) {

		int pivot = arr[low + (high - low) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;

	}

	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
