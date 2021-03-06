package com.example.przemek;

import javax.swing.JFrame;

import com.example.przemek.controller.BubbleSortController;
import com.example.przemek.model.BubbleSortModel;
import com.example.przemek.view.BubbleSortView;

public class BubbleSorter {
	
	public static void main(String[] args) {
		
	BubbleSortView MainView = new BubbleSortView();
	BubbleSortModel MainModel = new BubbleSortModel();
	
	BubbleSortController MainController = new BubbleSortController(MainModel, MainView);
	
	MainView.setVisible(true);
	MainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
