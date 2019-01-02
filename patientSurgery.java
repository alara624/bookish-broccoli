package patientSurgery;

import javax.swing.JOptionPane;
import java.util.*;
public class patientSurgery {

static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {	
		String 				
			docName="", 
			name="",
			highestName = "", 
			highestDoc = "", 
			hospName="", 
			value=null,
			type="", 
			highestHospital = "",
			perfDoc="";
		double 
			insurFeeUPMC=0.0, 
			insurFeeAGH=0.0,
			highestFee = 0.0, 
			avgFeeUPMC=0.0, 
			avgFeeAGH=0.0,
			totalFeeUPMC = 0.0,
			totalFeeAGH = 0.0;
		int 
			kneeCount=0, 
			hipCount=0, 
			upmcCount=0, 
			aghCount=0,
			docAtkCount=0, 
			docJohnCount=0, 
			docSmithCount=0,
			value2=1;		
		
		
		while (value2 != 2){		
			
			hospName=JOptionPane.showInputDialog(null, "Please enter hospital name: UPMC or AGH", "Input Data", JOptionPane.QUESTION_MESSAGE);
				if (hospName.equals("UPMC")){ 
					JOptionPane.showMessageDialog(null, "Thank you for choosing UPMC.", "Input Data", JOptionPane.INFORMATION_MESSAGE);
					upmcCount++; 
				}
				else if (hospName.equals("AGH")){ 
					JOptionPane.showMessageDialog(null, "Thank you for choosing AGH.", "Input Data", JOptionPane.INFORMATION_MESSAGE);
					aghCount++; 
				}
					
					
			docName=JOptionPane.showInputDialog(null,"Please enter doctor's name: Atkins, Johnson, or Smith.", "Input Data", JOptionPane.QUESTION_MESSAGE);				
							
			    if (docName.equals("Atkins")){
			    	docAtkCount++;
			    }
				else if (docName.equals("Johnson")){
					docJohnCount++;    
				}
			    else if (docName.equals("Smith")){
			    	docSmithCount++;
			    } 
			    
			type=JOptionPane.showInputDialog(null, "Knee (K) or Hip (H)?","Input Data",JOptionPane.QUESTION_MESSAGE); //added "type="
				if (type.equals("K")){
					kneeCount++; 
				}
				else if (type.equals("H")){
					hipCount++; 
				}
			
			name=JOptionPane.showInputDialog(null, "Please enter patient's last name.", "Input Data", JOptionPane.QUESTION_MESSAGE);
			
			value=JOptionPane.showInputDialog(null, "Please enter insurance fee amount.", "Input Data", JOptionPane.QUESTION_MESSAGE);
			if (hospName.equals("UPMC")){
				insurFeeUPMC=Double.parseDouble(value);
				totalFeeUPMC += insurFeeUPMC;   
				if(insurFeeUPMC > highestFee){
					highestFee = insurFeeUPMC;				
					highestName = name;
					highestDoc = docName;
					highestHospital = hospName;
				}
			}
			else if (hospName.equals("AGH")){
				insurFeeAGH=Double.parseDouble(value);
				totalFeeAGH += insurFeeAGH;   	
				if(insurFeeAGH > highestFee){
					highestFee = insurFeeAGH;				
					highestName = name;
					highestDoc = docName;
					highestHospital = hospName;
					
				}
			}
					
			value=JOptionPane.showInputDialog(null, "Enter more? Yes (1) No (2).");
			value2=Integer.parseInt(value);
			
			
			insurFeeUPMC = 0;
			insurFeeAGH = 0;
			hospName = "";
			docName = "";
			type = "";
			value = "";			
		}
			
			
				
		if ((docAtkCount>docJohnCount)&&(docAtkCount>docSmithCount)){			
			highestDoc="Dr. Atkins";
		}
		else if ((docJohnCount>docAtkCount)&&(docJohnCount>docSmithCount)){
			highestDoc="Dr. Johnson";
		}
		else if ((docSmithCount>docAtkCount)&&(docSmithCount>docAtkCount)){
			highestDoc="Dr. Smith";
		}
		
		if (perfDoc.equals(docName)) {
			docName=console.next();
			
		}
		
			
		avgFeeUPMC= (totalFeeUPMC/upmcCount); 
		avgFeeAGH= (totalFeeAGH/aghCount); 	 
		
			
			
			
		String output = "# of Knee Joint Replacements = " + kneeCount + "\n" +
						 "# of Hip Joint Replacements = " + hipCount+ "\n" +
						 "UPMC Average Fee = " + avgFeeUPMC + "\n" +
						 "AGH Average Fee = " + avgFeeAGH + "\n"+
						 "# of Surgeries: Dr. Atkins = " + docAtkCount + "\n" +
						 "# of Surgeries: Dr. Johnson = " + docJohnCount + "\n" +
						 "# of Surgeries: Dr. Smith = " + docSmithCount+ "\n" +
						 "Greatest # of surgeries performed by: " + highestDoc + "\n" +
						 "Highest Fee ($" + highestFee + ") Paid By: " + highestName + "\n" +
						 "at " + highestHospital + "\n" + "by: " +perfDoc+ "\n";
					
		
		JOptionPane.showMessageDialog(null, output, "Information Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
		
		
	}	
}
