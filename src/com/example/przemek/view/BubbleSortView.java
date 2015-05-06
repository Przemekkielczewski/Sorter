package com.example.przemek.view;


import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BubbleSortView extends JFrame {
	
	private JTextField numberOne = new JTextField();
	private JTextField numberTwo = new JTextField();
	private JTextField numberThree = new JTextField();
	private JTextField numberFour = new JTextField();
	private JTextField numberFive = new JTextField();
	private JTextField numberSix = new JTextField();
	private JTextField numberSeven = new JTextField();
	
	private JRadioButton radioButton1 = new JRadioButton ("Ascending", true);
	private JRadioButton radioButton2 = new JRadioButton ("Descending", false);
	private JButton sortButton = new JButton("Sort Values");
	
	private JTextField sortedOne = new JTextField();
	private JTextField sortedTwo = new JTextField();
	private JTextField sortedThree = new JTextField();
	private JTextField sortedFour = new JTextField();
	private JTextField sortedFive = new JTextField();
	private JTextField sortedSix = new JTextField();
	private JTextField sortedSeven = new JTextField();
	
	public BubbleSortView() {
		
		JPanel inputPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel outputPanel = new JPanel();
	
		ButtonGroup buttonGroup = new ButtonGroup();
		
		this.setSize(350,300);
		this.setTitle("Bubble Sorter v. 1.0");
		this.setLayout(new GridLayout(1,3));
		
		inputPanel.setLayout(new GridLayout (7,1));
		inputPanel.add(numberOne);
		inputPanel.add(numberTwo);
		inputPanel.add(numberThree);
		inputPanel.add(numberFour);
		inputPanel.add(numberFive);
		inputPanel.add(numberSix);
		inputPanel.add(numberSeven);
		
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		
		buttonPanel.add(sortButton);
		buttonPanel.add(radioButton1);
		buttonPanel.add(radioButton2);
		
		outputPanel.setLayout(new GridLayout (7,1));
		outputPanel.add(sortedOne);
		outputPanel.add(sortedTwo);
		outputPanel.add(sortedThree);
		outputPanel.add(sortedFour);
		outputPanel.add(sortedFive);
		outputPanel.add(sortedSix);
		outputPanel.add(sortedSeven);
		
		this.add(inputPanel);
		this.add(buttonPanel);
		this.add(outputPanel);
		
	};
	
	public int getNumberOne () {
	return Integer.parseInt(numberOne.getText());	
	}
	
	public int getNumberTwo () {
		return Integer.parseInt(numberTwo.getText());	
		}
	
	public int getNumberThree () {
		return Integer.parseInt(numberThree.getText());	
		}
	
	public int getNumberFour () {
		return Integer.parseInt(numberFour.getText());	
		}
	
	public int getNumberFive () {
		return Integer.parseInt(numberFive.getText());	
		}
	
	public int getNumberSix () {
		return Integer.parseInt(numberSix.getText());	
		}
	
	public int getNumberSeven () {
		return Integer.parseInt(numberSeven.getText());	
		}
	
	public void setSortedOne (int value) {
		this.sortedOne.setText(Integer.toString(value));	
		}
	
	public void setSortedTwo (int value) {
		this.sortedTwo.setText(Integer.toString(value));	
		}
	
	public void setSortedThree (int value) {
		this.sortedThree.setText(Integer.toString(value));	
		}
	public void setSortedFour (int value) {
		this.sortedFour.setText(Integer.toString(value));	
		}
	
	public void setSortedFive (int value) {
		this.sortedFive.setText(Integer.toString(value));	
		}
	
	public void setSortedSix (int value) {
		this.sortedSix.setText(Integer.toString(value));	
		}
	
	public void setSortedSeven (int value) {
		this.sortedSeven.setText(Integer.toString(value));	
		}
	
	public void addAscendingListener (ActionListener listenerForAscend) {
		this.radioButton1.addActionListener(listenerForAscend);
	}
	
	public void addDescendingListener (ActionListener listenerForDescend) {
		this.radioButton2.addActionListener(listenerForDescend);
	}
	
	public void addSortListener (ActionListener listenerForSort) {
		this.sortButton.addActionListener(listenerForSort);
	}
	
	public void DisplayError(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);		
	}
}
