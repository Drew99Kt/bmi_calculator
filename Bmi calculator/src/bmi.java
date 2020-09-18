import java.awt.geom.Arc2D.Double;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				//String height;
				//height=JOptionPane.showInputDialog("how tall are you");
				//System.out.println(height);
				
				/*String[] options = {"5'5'''", "5'6''", "5'7''", "5'8''", "5'9''", "5'10''" ,"add more till 6 10"};
		        ImageIcon icon = new ImageIcon("C:/Users/Andrew/Desktop/Tech%20Circle/projects/bmi/turtle32.jpg");
		        int height = (int)JOptionPane.showInputDialog(null, "how tall are you??", 
		                "Bmi Calculator", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);*/
		
		double height= Integer.parseInt(JOptionPane.showInputDialog("how tall are you in inches"));
		       
		        
		        double weight= Integer.parseInt (JOptionPane.showInputDialog( "how much do you weigh"));
		        
		       // int mathWeight= 703;
		       //int correctedWeight;
		       
		      // int correctedHeight;
		       //correctedHeight=  height * 12;
		       
		       
		       
		  //      correctedWeight = weight * mathWeight;
		        
		        double bmiWeight= 703* weight;
		       double bmiHeight= (int) Math.pow(height, 2);
		       double bmiFinal= bmiWeight/bmiHeight;
		      //  System.out.println(correctedWeight);
		        
		        System.out.println (bmiFinal);
		        
		        
		        //Math.pow(23, 5); // 23 to the fifth power
		        
		        /*BMI Categories:
		        	Underweight = <18.5
		        	Normal weight = 18.5–24.9
		        	Overweight = 25–29.9
		        	Obesity = BMI of 30 or greater*/
		        
		       
		        
		        //weight=JOptionPane.showInputDialog("how much do you weight");
				
		        //BMI = 703 x Weight / Height^2
		        
				
				
				
	}

		
	}
				

