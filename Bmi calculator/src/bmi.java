import java.awt.Component;
import java.awt.geom.Arc2D.Double;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class bmi {

	        public static void main(String[] args) {
		
		    JTextField feet = new JTextField(5);
            JTextField inches = new JTextField(5);

            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("feet:"));
            myPanel.add(feet);
            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
            myPanel.add(new JLabel("inches:"));
            myPanel.add(inches);

    	    int result = JOptionPane.showConfirmDialog(null, myPanel, 
             "How tall are you", JOptionPane.OK_CANCEL_OPTION);
    	    if (result == JOptionPane.OK_OPTION) {
    		
    		
    		{
    	   	  System.out.println(result);
    	   	
    	   	  String feetMem= feet.getText();
    	   	  int feet1 = Integer.parseInt(feetMem);
    	  
    	   	
    	   
    	       String inchesMem= inches.getText();
    	   	   int inches1 = Integer.parseInt(inchesMem); //if you enter nothing, it crashes
    	   	
    	       //JTextField feet = new JTextField("-5");
    	       // 	String text = feet.getText();
    	       //int xaxis1 = Integer.parseInt(text);
    	    	
		
		       //double height= Integer.parseInt(JOptionPane.showInputDialog("how tall are you in inches"));
		       
		        
		       double weight= Integer.parseInt (JOptionPane.showInputDialog( "how much do you weigh"));
		        
		       //this is a place holder, its not working
		       int footMeasurement= 12;
		        
		        
		       int adjustedHeight=   feet1 * footMeasurement;
		       int adjustedHeight2= adjustedHeight + inches1;
		
		        
		       double bmiWeight= 703* weight;
		       double bmiHeight= (int) Math.pow(adjustedHeight2, 2);
		       int bmiFinal= (int) (bmiWeight/bmiHeight);
		      
		        
		       
		       	/*Underweight: < 18.5

				Normal weight: 18.5 - 24.9

				Overweight: 25 - 29.9

				Obese: ≥ 30*/
		     
		       
		       if (bmiFinal >= 0 && bmiFinal <= 18.5) {
		    	   JOptionPane.showMessageDialog(null,"YourBmi is "+bmiFinal+ ", your underweight");
		       }
		       else if (bmiFinal >= 18.5 && bmiFinal <= 24.9){
		    	   JOptionPane.showMessageDialog(null,"Your Bmi is "+ bmiFinal +", your weight is normal");
		       }
		       else if (bmiFinal >= 25 && bmiFinal <=29.9) {
		    	   JOptionPane.showMessageDialog (null,"Your Bmi is "+bmiFinal+ ", Your overweight");
		       }
		       else if (bmiFinal >=29.9 && bmiFinal <=100) {
		    	   JOptionPane.showMessageDialog(null,"Your Bmi is " +bmiFinal + ", Your Obese");
		       }
		       
		        
		      
		        
		       
		        
		      
		        
				
				
				
	}

		
	}
}			
}
