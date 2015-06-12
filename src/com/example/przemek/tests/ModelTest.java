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

}