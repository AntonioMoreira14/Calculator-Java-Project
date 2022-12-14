package calc.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	
	public Calculator() {
		
		organizeLayout();
		
		setTitle("Calculator JAVA");
		setSize(345, 459);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void organizeLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		
		Keyboard keyboard = new Keyboard();
		add(keyboard, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
