package lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7 extends JFrame implements ActionListener{
	
	JLabel Results, Input;										/*Label for the result of the operation and label for the user input*/
	JTextField input, output;									/*input: were we receive user input, output: were we display the results of the operation*/
	JButton addition, subtraction, multiplication, division;	
	
	public Lab7(){
		
		super("Calculator");
		setLayout(new FlowLayout());
		
		
		//The results of the operation will be displayed here
		Results = new JLabel("Result");
		add(Results);
		output = new JTextField(20);
		output.setText("0");
		add(output);
		
		//This is were we take user input
		Input = new JLabel("Input");
		input = new JTextField(20);
		add(Input);
		add(input);
		
		//Adding the addition button
		addition = new JButton("+");
		addition.addActionListener(this);
		add(addition);
		
		//Adding the subtraction button
		subtraction = new JButton("-");
		subtraction.addActionListener(this);
		add(subtraction);
		
		//Adding the multiplication button
		multiplication = new JButton("*");
		multiplication.addActionListener(this);
		add(multiplication);
		
		//Adding the division button
		division = new JButton("/");
		division.addActionListener(this);
		add(division);
				
	}

	public static void main(String args[]){
		Lab7 Calculator = new Lab7();
		Calculator.setSize(300,150);
		Calculator.setVisible(true);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public void actionPerformed(ActionEvent event) {
		
		int numInResults, numInInput, total;
		
		numInInput = Integer.parseInt(input.getText());
		numInResults = Integer.parseInt(output.getText());
		
		switch(event.getActionCommand()){
		
		case "+": output.setText(""); total = numInInput + numInResults; output.setText("" + total ); break;
		case "-": output.setText(""); total = numInResults - numInInput; output.setText("" + total); break;
		case "*": output.setText(""); total = numInInput * numInResults; output.setText("" + total); break;
		default: output.setText(""); total = numInResults / numInInput; output.setText("" + total); break;
		
		}
		
	
		
	}
}

