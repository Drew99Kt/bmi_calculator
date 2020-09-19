import java.awt.geom.Arc2D.Double;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class bmi {

	public static void main(String[] args) {
		

		
				
		
		double height= Integer.parseInt(JOptionPane.showInputDialog("how tall are you in inches"));
		       
		        
		        double weight= Integer.parseInt (JOptionPane.showInputDialog( "how much do you weigh"));
		        
		   
		       
		       
		       
		
		        
		        double bmiWeight= 703* weight;
		       double bmiHeight= (int) Math.pow(height, 2);
		       double bmiFinal= bmiWeight/bmiHeight;
		      
		        
		        System.out.println (bmiFinal);
		        
		      
		        
		       
		        
		      
		        
				
				
				
	}

		
	}
				

