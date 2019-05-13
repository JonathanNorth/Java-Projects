package Assignment7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalUserFrame extends JFrame{
	
	private JLabel countryName;
	JTextField enterCountryName;
	JTextArea Output;
	JButton showStudents, sortedAscending, sortedDescending;
	
	private University universityStudents, copyUniversityStudents;
	
	
	
	public FinalUserFrame(final University universityStudents){
		
		super("Input Frame");
		
		this.universityStudents = universityStudents;
		
		setSize(600, 500);
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		countryName = new JLabel("Enter name of Country");
		add(countryName);
		
		enterCountryName = new JTextField(20);
		add(enterCountryName);
		
		Output = new JTextArea(20, 50);
		add(Output);
		
		showStudents = new JButton("Show Students");
		sortedAscending = new JButton("Show Student Sorted (Ascending)");
		sortedDescending = new JButton("Show Student Sorted (Descending");
		
		ActionListener printUniversityStudents = new ActionListener(){

			
			public void actionPerformed(ActionEvent event) {
				Output.setText(universityStudents.toString());
				
			}
			
		};
		
		ActionListener sortedListAscending = new ActionListener(){
			
				public void actionPerformed(ActionEvent event){
					copyUniversityStudents = universityStudents;
					copyUniversityStudents.sortStudents();
					OutputFrame newFrame = new OutputFrame("Sorted List (ascending) of Students", copyUniversityStudents.toString());
				}
			
						
					
		};
		
		ActionListener sortedListDescending = new ActionListener(){
		
				public void actionPerformed(ActionEvent e) {
					copyUniversityStudents = universityStudents;
					copyUniversityStudents.sortStudentsDescending();
					System.out.println(copyUniversityStudents);
					OutputFrame newFrame = new OutputFrame("Sorted List (descending) of Students", universityStudents.toString());
				}
		};
		
		ActionListener displayNumStudentsInCountry = new ActionListener(){

			
			public void actionPerformed(ActionEvent event) {
				Output.setText("Number of students from " + enterCountryName.getText() + " is " + universityStudents.numberOfStudents(enterCountryName.getText()));
				enterCountryName.setText("");
			}
			
		};
		
		enterCountryName.addActionListener(displayNumStudentsInCountry);
		showStudents.addActionListener(printUniversityStudents);
		sortedAscending.addActionListener(sortedListAscending);
		sortedDescending.addActionListener(sortedListDescending);
		
		add(showStudents);
		add(sortedAscending);
		add(sortedDescending);
		
		this.setVisible(true);
		
		
		
	}
	
	

	
		
}
