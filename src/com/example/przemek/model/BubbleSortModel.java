package com.example.przemek.model;

public class BubbleSortModel {

	public void SortAscending(int[] array, int arraySize) {
		int Helper = 0;
		
		for (int i = 0; i <= arraySize -2; i++) {
			
			for (int j = 0; j <= arraySize -2; j++) {

				if (array[j] > array[j + 1]) {
					Helper = array[j + 1];
					array[j + 1] = array[j];
					array[j] = Helper;				
				}
			}
		}
	}
	
	public void SortDescending(int[] array, int arraySize) {
		int Helper = 0;
		
		for (int i = 0; i <= arraySize -2; i++) {
			
			for (int j = 0; j <= arraySize -2; j++) {

				if (array[j] < array[j + 1]) {
					Helper = array[j + 1];
					array[j + 1] = array[j];
					array[j] = Helper;				
				}
			}
		}
	}
}
