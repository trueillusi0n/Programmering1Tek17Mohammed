package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	private JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit(); 
	
	//public static Color color = Color.red;
	public Main() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		this.setSize(500, 500);
		//this.setUndecorated(true);
		this.setVisible(true);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.black);
		addButtons(contentPane);
}


	public void addButtons(Container contentPane) {
		Color greenColor = new Color (56, 150, 56);
		
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBounds(50, 50, 100, 50);
		closeButton.setBackground(new Color(56, 200, 65));
		closeButton.setForeground(Color.white);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);
		
		text = new JLabel ("Hello World");
		text.setBounds(50, 150, 100, 250);
		text.setForeground(greenColor);
		contentPane.add(text);
		
		
		JButton changeTextButton = new JButton("Change");
		changeTextButton.setBounds(50, 150, 100, 50);
		changeTextButton.setBackground(new Color(56, 200, 65));
		changeTextButton.setForeground(Color.white);
		changeTextButton.addActionListener(event -> changeTextButton());
		contentPane.add(changeTextButton);
		
	}
	
	
	private Object changeTextButton() {
		//String currentText = text.getText();
		if (text.getText().equalsIgnoreCase("Hello World"))
			text.setText("Bye world!");
		else 
			text.setText("Hello World");
		return null;
	}


	private Object closeButtonPressed() {
		new ClosingFrame();
		return null;

	}


	public void buttonPressed() {
		System.exit(0);
	}
	

	public static void main(String[] args) {
		Main frame = new Main ();
		//frame.addButtons(contentPane);
		//Main.addButtons();
		

	}

}
