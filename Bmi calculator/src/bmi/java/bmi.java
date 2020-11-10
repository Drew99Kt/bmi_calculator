package bmi.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class bmi implements ActionListener {

//	public class Test { 
//		  public int x = 5; 
//		} 
//		Then you can access the variable x from any other class as follows,
//
//		Test t = new Test(); 
//		int y = t.x; 

	public static JPanel panel;
	public static JFrame frame;
	public static JLabel feetLabel;
	public static JLabel inchesLabel;
	public static JTextField feetText;
	public static JTextField inchesText;
	public static JButton button;
	public static JLabel weightlabel;
	public static JTextField weightText;
	public static JLabel bmiFinalLabel;

	public static void main(String[] args) {

		panel = new JPanel();

		// frame build
		frame = new JFrame("Bmi Calculator");
		frame.setBounds(400, 50, 10, 50);
		frame.setSize(370, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		// feet label
		feetLabel = new JLabel("Feet", SwingConstants.CENTER);
		feetLabel.setBounds(10, 40, 80, 25);
		panel.add(feetLabel);

		// feet text
		feetText = new JTextField();
		feetText.setBounds(100, 40, 165, 25);
		panel.add(feetText);

		// inches label
		inchesLabel = new JLabel("Inches", SwingConstants.CENTER);
		inchesLabel.setBounds(10, 70, 80, 25);
		panel.add(inchesLabel);

		// inches text
		inchesText = new JTextField("12");
		inchesText.setBounds(100, 70, 165, 25);
		panel.add(inchesText);

		// weight label
		weightlabel = new JLabel("weight", SwingConstants.CENTER);
		weightlabel.setBounds(10, 100, 80, 25);
		panel.add(weightlabel);

		// weight test
		weightText = new JTextField();
		weightText.setBounds(100, 100, 165, 25);
		panel.add(weightText);

		// Submit button
		button = new JButton("Sumbit");
		button.setBounds(100, 140, 80, 25);
		button.addActionListener(new bmi());
		panel.add(button);

		// Weight label
		weightlabel = new JLabel("Enter your height and weight");
		weightlabel.setBounds(100, 5, 300, 25);
		panel.add(weightlabel);

		// this is the output after the math runs
		bmiFinalLabel = new JLabel("");
		bmiFinalLabel.setBounds(80, 180, 300, 25);
		panel.add(bmiFinalLabel);

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// this makes sure user knows they are leaving blanks fields. no checks if
		// letters are entered
		if (feetText.getText().trim().isEmpty()) {
			bmiFinalLabel.setText("The Field for feet wasn't entered");
		} else if (inchesText.getText().trim().isEmpty()) {
			bmiFinalLabel.setText("The Field for inches wasn't entered");
		} else if (weightText.getText().trim().isEmpty()) {
			bmiFinalLabel.setText("The Field for weight wasn't entered");
		}

		// converting string to int
		String feetmem = feetText.getText();
		int feetnum = Integer.parseInt(feetmem);

		// converting string to int
		String inchesmem = inchesText.getText();
		int inchesnum = Integer.parseInt(inchesmem);

		// converting string to int
		String weightmem = weightText.getText();
		int weightnum = Integer.parseInt(weightmem);

		// start of bmi math
		int footMeasurement = 12;

		int adjustedHeight = feetnum * footMeasurement;
		int adjustedHeight2 = adjustedHeight + inchesnum;

		double bmiWeight = 703 * weightnum;

		double bmiHeight = (int) Math.pow(adjustedHeight2, 2);

		int bmiFinal = (int) (bmiWeight / bmiHeight);
		// end of math

		// Bmi results
		if (bmiFinal >= 0 && bmiFinal <= 18.5) {
			bmiFinalLabel.setText(String.valueOf("Your BMI is " + bmiFinal + ", your underweight"));

		} else if (bmiFinal >= 18.5 && bmiFinal <= 24.9) {
			bmiFinalLabel.setText(String.valueOf("Your BMI is " + bmiFinal + ", your weight is normal"));

		} else if (bmiFinal >= 25 && bmiFinal <= 29.9) {
			bmiFinalLabel.setText(String.valueOf("Your BMI is " + bmiFinal + ", Your overweight"));

		} else if (bmiFinal >= 29.9 && bmiFinal <= 100) {
			bmiFinalLabel.setText(String.valueOf("Your BMI is " + bmiFinal + ", Your overweight"));

		}
//test
	}

}
