package com.example.przemek.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.przemek.model.BubbleSortModel;;

public class ModelTest {

	BubbleSortModel model = new BubbleSortModel();
	
	@Test
	public void testSortDescending() {
		int [] testArray = new int [] {2,5,1,7,12,9,8};
		model.SortAscending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 1);
		assertTrue("second value incorrect",testArray[1] == 2);
		assertTrue("third value incorrect",testArray[2] == 5);
		assertTrue("fourth value incorrect",testArray[3] == 7);
		assertTrue("fifth value incorrect",testArray[4] == 8);
		assertTrue("sixth value incorrect",testArray[5] == 9);
		assertTrue("seventh value incorrect",testArray[6] == 12);
		
	}
	
	@Test
	public void testSortAscending() {
		int [] testArray = new int [] {2,5,1,7,12,9,8};
		model.SortDescending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 12);
		assertTrue("second value incorrect",testArray[1] == 9);
		assertTrue("third value incorrect",testArray[2] == 8);
		assertTrue("fourth value incorrect",testArray[3] == 7);
		assertTrue("fifth value incorrect",testArray[4] == 5);
		assertTrue("sixth value incorrect",testArray[5] == 2);
		assertTrue("seventh value incorrect",testArray[6] == 1);
	}
	
	@Test
	public void testSortDescSame() {
		int [] testArray = new int [] {2,5,5,5,5,9,8};
		model.SortAscending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 2);
		assertTrue("second value incorrect",testArray[1] == 5);
		assertTrue("third value incorrect",testArray[2] == 5);
		assertTrue("fourth value incorrect",testArray[3] == 5);
		assertTrue("fifth value incorrect",testArray[4] == 5);
		assertTrue("sixth value incorrect",testArray[5] == 8);
		assertTrue("seventh value incorrect",testArray[6] == 9);
	}
		
	@Test
	public void testSortAscSame() {
		int [] testArray = new int [] {2,5,5,5,5,9,8};
		model.SortDescending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 9);
		assertTrue("second value incorrect",testArray[1] == 8);
		assertTrue("third value incorrect",testArray[2] == 5);
		assertTrue("fourth value incorrect",testArray[3] == 5);
		assertTrue("fifth value incorrect",testArray[4] == 5);
		assertTrue("sixth value incorrect",testArray[5] == 5);
		assertTrue("seventh value incorrect",testArray[6] == 2);
	}
	
	@Test
	public void testSortDescBorder() {
		int [] testArray = new int [] {2,5,3,7,12,9,1};
		model.SortAscending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 1);
		assertTrue("second value incorrect",testArray[1] == 2);
		assertTrue("third value incorrect",testArray[2] == 3);
		assertTrue("fourth value incorrect",testArray[3] == 5);
		assertTrue("fifth value incorrect",testArray[4] == 7);
		assertTrue("sixth value incorrect",testArray[5] == 9);
		assertTrue("seventh value incorrect",testArray[6] == 12);
	}
	
	@Test
	public void testSortAscBorder() {
		int [] testArray = new int [] {1,5,3,7,12,9,8};
		model.SortDescending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 12);
		assertTrue("second value incorrect",testArray[1] == 9);
		assertTrue("third value incorrect",testArray[2] == 8);
		assertTrue("fourth value incorrect",testArray[3] == 7);
		assertTrue("fifth value incorrect",testArray[4] == 5);
		assertTrue("sixth value incorrect",testArray[5] == 3);
		assertTrue("seventh value incorrect",testArray[6] == 1);
	}
	
	@Test
	public void testSortDescCorrect() {
		int [] testArray = new int [] {1,2,3,5,7,9,12};
		model.SortAscending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 1);
		assertTrue("second value incorrect",testArray[1] == 2);
		assertTrue("third value incorrect",testArray[2] == 3);
		assertTrue("fourth value incorrect",testArray[3] == 5);
		assertTrue("fifth value incorrect",testArray[4] == 7);
		assertTrue("sixth value incorrect",testArray[5] == 9);
		assertTrue("seventh value incorrect",testArray[6] == 12);
	}
	
	@Test
	public void testSortAscCorrect() {
		int [] testArray = new int [] {12,9,8,7,5,3,1};
		model.SortDescending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 12);
		assertTrue("second value incorrect",testArray[1] == 9);
		assertTrue("third value incorrect",testArray[2] == 8);
		assertTrue("fourth value incorrect",testArray[3] == 7);
		assertTrue("fifth value incorrect",testArray[4] == 5);
		assertTrue("sixth value incorrect",testArray[5] == 3);
		assertTrue("seventh value incorrect",testArray[6] == 1);
	}
	
	@Test
	public void testSortDescZero() {
		int [] testArray = new int [] {0,0,0,0,0,0,0};
		model.SortAscending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == 0);
		assertTrue("second value incorrect",testArray[1] == 0);
		assertTrue("third value incorrect",testArray[2] == 0);
		assertTrue("fourth value incorrect",testArray[3] == 0);
		assertTrue("fifth value incorrect",testArray[4] == 0);
		assertTrue("sixth value incorrect",testArray[5] == 0);
		assertTrue("seventh value incorrect",testArray[6] == 0);
	}
	
	@Test
	public void testSortNegDescending() {
		int [] testArray = new int [] {-2,-5,-1,-7,-12,-9,-8};
		model.SortDescending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == -1);
		assertTrue("second value incorrect",testArray[1] == -2);
		assertTrue("third value incorrect",testArray[2] == -5);
		assertTrue("fourth value incorrect",testArray[3] == -7);
		assertTrue("fifth value incorrect",testArray[4] == -8);
		assertTrue("sixth value incorrect",testArray[5] == -9);
		assertTrue("seventh value incorrect",testArray[6] == -12);
		
	}
	
	@Test
	public void testSortNegAescending() {
		int [] testArray = new int [] {-2,-5,-1,-7,-12,-9,-8};
		model.SortAscending(testArray, 7);
		assertTrue("first value incorrect",testArray[0] == -12);
		assertTrue("second value incorrect",testArray[1] == -9);
		assertTrue("third value incorrect",testArray[2] == -8);
		assertTrue("fourth value incorrect",testArray[3] == -7);
		assertTrue("fifth value incorrect",testArray[4] == -5);
		assertTrue("sixth value incorrect",testArray[5] == -2);
		assertTrue("seventh value incorrect",testArray[6] == -1);
	}
	
	

}