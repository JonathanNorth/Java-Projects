package Assignment7;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class OutputFrame extends JFrame implements ActionListener{
		private JLabel messageToUser;
		JTextArea outputArea;
		JButton closeWindow;  

		public OutputFrame (String captionForTextArea, String universityStudentsList){
			super("Output Frame");
			String sortedListOfStudents = universityStudentsList;
			System.out.println(sortedListOfStudents);
			setLayout(new FlowLayout());
			messageToUser = new JLabel(captionForTextArea);
			add(messageToUser);
			outputArea = new JTextArea(20, 50);
            add(outputArea);
			closeWindow = new JButton("Close Window"); // This was not required
			closeWindow.addActionListener(this);  // This was not required
			add(closeWindow);  // This was not required
			setSize(600,500);
			setVisible(true);
			
			
			displayMessage(universityStudentsList);
		}
		
		public void displayMessage(String stringToDisplay){
			outputArea.setText(stringToDisplay);
		}
		
			public void actionPerformed(ActionEvent e){// I have not discussed dispatchEcvent method. 
				                                       // This is just to show you something you may be interested in
				this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
			}
}