package com.app.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 7, 9, 1, 6, 2, 8,5 };
		sortArr(arr, 0, arr.length - 1);
		printArr(arr);
	}

	public static void sortArr(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			sortArr(arr, low, mid);
			sortArr(arr, mid + 1, high);
			mergeArr(arr, low, mid, high);
		}
	}

	private static void mergeArr(int[] arr, int low, int mid, int high) {
		int size1 = mid - low + 1;
		int size2 = high - mid;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[low + i];
		}
		for (int i = 0; i < size2; i++) {
			arr2[i] = arr[mid + i + 1];
		}

		int i = 0, j = 0, k = low;
		while (i < size1 && j < size2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < size2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

	}

	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
