package lawFirm;
import javax.swing.JOptionPane;
public class lawFirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String lawFirm, client;
double billHours = 0, courtCosts = 0, hourlyFees, legalFees, discount, finalLegal;

lawFirm=JOptionPane.showInputDialog(null,
"Please enter name of law firm ", "Input Data", JOptionPane.QUESTION_MESSAGE);
client=JOptionPane.showInputDialog(null, 
"Please enter client name", "Input Data", JOptionPane.QUESTION_MESSAGE);

hourlyFees= billHours*400;
legalFees= hourlyFees+courtCosts;
discount= legalFees*0.05;
finalLegal= legalFees - discount;

String output = "lawFirm= " +lawFirm+ "\n"+ 
"client= " +client+"\n"+
"billHours= " +billHours+"\n"+
"courtCosts= " +courtCosts+"\n"+
"hourlyFees= " +hourlyFees+"\n"+
"legalFees= " +legalFees+"\n"+
"discount= " +discount+"\n"+
"final_legal= " +finalLegal+"\n";
JOptionPane.showMessageDialog(null, output, "Final Legal Fees", JOptionPane.INFORMATION_MESSAGE);
System.exit(0);














	}

}
