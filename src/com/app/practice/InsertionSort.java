package com.app.practice;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 7, 9, 1, 6, 2, 8 };
		sortArr(arr);
		printArr(arr);
	}
	private static void sortArr(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}
	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
