package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		JButton add = new JButton("Add Name");
		JButton view = new JButton("View Names");
		ArrayList<String> names = new ArrayList <String>();
	public void run() {
		
		frame.setVisible(true);
		add.addActionListener(this);
		view.addActionListener(this);
		panel.add(add);
		panel.add(view);
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			names.add(JOptionPane.showInputDialog("A new guest appears! What's their name?"));
		}
		if(e.getSource()==view) {
			System.out.println("Guest List:");
			for(int i = 0; i<names.size();i++) {
				System.out.println(i+1 + ": " + names.get(i));
			}
		}
	}
}
