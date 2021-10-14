package com.app.sorting;

public class BubbleSort {
	public static void main(String []args) {
		int arr[] = {5,4,3,7,9,1,6,2,8};
		sortArr(arr,0,arr.length-1);
		printArr(arr);
	}

	public static void sortArr(int[] arr, int low, int high) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}
	
	public static void printArr(int arr[]){
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
