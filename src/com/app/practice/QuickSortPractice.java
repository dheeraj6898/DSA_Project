package com.app.practice;

public class QuickSortPractice {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 7, 9, 1, 6, 2, 8 };
		sortArr(arr, 0, arr.length - 1);
		printArr(arr);
	}

	private static void sortArr(int[] arr, int low, int high) {
		int piv = partition(arr,low,high);
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low+(high-low)/2];
		while(low<high) {
			
		}
		return 0;
	}

	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
