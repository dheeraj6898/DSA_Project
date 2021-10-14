package com.app.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 7, 9, 1, 6, 2, 8 };
		sortArr(arr, 0, arr.length);
		printArr(arr);
	}

	public static void sortArr(int[] arr, int low, int high) {

		for (int i = 0; i < arr.length - 1; i++) {
			int j = i-1;
			int val = arr[i];
			while(j>=0 && arr[j]>val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = val;
		}

	}

	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
