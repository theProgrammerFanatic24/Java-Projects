package createFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class info extends JFrame implements ActionListener {
	
	// Menu Bar Variables
	
	// There Are Two Menus, File and Help
	
	JMenuBar menu = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu help = new JMenu("Help");
	
	//Items in the Menu include process, clear , exit, and about in the Help Section
	
	JMenuItem process = new JMenuItem("Process");
	JMenuItem clear = new JMenuItem("Clear");
	JMenuItem exit = new JMenuItem("Exit");
	JMenuItem about = new JMenuItem("About");
	
	// The Frame has 3 labels and 3 textboxes
	
	// Labels
	
	JLabel label1 = new JLabel("Name");
	JLabel label2 = new JLabel("Email");
	JLabel label3 = new JLabel("Telephone");
	
	//Text Boxes
	
	JTextField field1 = new JTextField(15);
	JTextField field2 = new JTextField(15);
	JTextField field3 = new JTextField(15);
	
	
	public info() {
		
		//Setting Up the Frame
		this.setTitle("Input Form");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		
		
		// Setting Up the Menu Bar by calling the menu
		
		this.setJMenuBar(menu);
		
		// ADD THE ITEMS
		
		this.menu.add(file);
		this.menu.add(help);
		
		
		//File Items are Added
		// File Items
		
		this.file.add(process);
		this.file.add(clear);
		this.file.add(exit);
		
		//Help Items
		
		this.help.add(about);
		
		// ADD Labels and TextField and Set Size
		
		//Label1
		this.add(label1);
		this.label1.setBounds(30, 50, 40, 30);
		this.add(field1);
		this.field1.setBounds(100,50,200,25);
		
		
		//Label2
		
		this.add(label2);
		this.label2.setBounds(30, 122, 40, 30);
		this.add(field2);
		this.field2.setBounds(100,125,200,25);
		
		
		//Label3
		
		this.add(label3);
		this.label3.setBounds(30, 192, 70, 30);
		this.add(field3);
		this.field3.setBounds(100,195,200,25);
		
		
		//actions
		
		process.addActionListener(this);
		clear.addActionListener(this);
		exit.addActionListener(this);
		about.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// About
		
		if(e.getSource()==about) {
			String aboutMessage = "This Application was developed by Intisar Ratul for the purpose of displaying NAME    -   EMAIL   -   PHONE NUMBER based on user input\n"+"This is Currently v1.0";
			JOptionPane.showMessageDialog(new JFrame(), aboutMessage,"App Info",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource()== process) {
			String processMessage = field1.getText()+"\n"+field2.getText()+"\n"+field3.getText();
			JOptionPane.showMessageDialog(new JFrame(), processMessage,"Personal Data",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource()==clear) {
			field1.setText(" ");
			field2.setText(" ");
			field3.setText(" ");
		}
		else if(e.getSource()==exit) {
			System.exit(0);
		}	
	}
	
	public static void main(String[] args) {
		new info();	
	}	
}
