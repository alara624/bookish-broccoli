package onlinePurchase;
import javax.swing.JOptionPane;
public class onlinePurchase {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, myItem = null, shipName, onlinePurchase, value;
		double itemCost, totalCost, taxAmount, shipCost, finalAmount, giftCardAmount, noGift = 0;
		int numOfItem, giftCard;
		
		
		value = JOptionPane.showInputDialog(null,
				"Enter quanitity of item to purchase", "Input Data", JOptionPane.QUESTION_MESSAGE);
		numOfItem = Integer.parseInt(value);
		
		value = JOptionPane.showInputDialog(null,
				"Applying Gift Card? 1 = Yes 0 = No", "Input Data", JOptionPane.QUESTION_MESSAGE);
		giftCard = Integer.parseInt(value);
		
		if (giftCard ==1)
		value = JOptionPane.showInputDialog(null,
				"Please enter amount", "Input Data", JOptionPane.QUESTION_MESSAGE);
		giftCardAmount = Integer.parseInt(value); 
		
		if (giftCard==0)
			value = JOptionPane.showInputDialog(null,
					"Please enter 0 to continue", "Input Data", JOptionPane.QUESTION_MESSAGE);
			noGift = Integer.parseInt(value);
			
		onlinePurchase = "Alyse's Cart";
		shipName = "Ship to:";
		name ="Alyse Lara";
		myItem ="HP Laptop Computer";
		itemCost = 100;
		totalCost= itemCost*numOfItem;
		taxAmount = totalCost*0.07;
		shipCost = totalCost*0.01;
		finalAmount = (totalCost + taxAmount + shipCost) - giftCardAmount;
		
		
		String output = " " +onlinePurchase+ "\n"+ 
				" " +shipName+ "\n"+
				" " +name+"\n"+
				"Item: " +myItem+"\n"+
				"Item price: " +itemCost+"\n"+
				"Quantity: " +numOfItem+"\n"+
				"Total: " +totalCost+"\n"+
				"Tax: " +taxAmount+"\n"+
				"Shipping: " +shipCost+"\n"+
				"Gift Card Applied: " +giftCardAmount+"\n"+
				"Final Total: " +finalAmount+"\n";
				JOptionPane.showMessageDialog(null, output, "Total Due", JOptionPane.INFORMATION_MESSAGE);
				
				
			
		System.out.println("Ship to: ");
		System.out.println("" +name);
		System.out.println("Item: " +myItem);
		System.out.println("Item Price: " +itemCost);
		System.out.println("Quantity: " +numOfItem);
		System.out.println("Total: " +totalCost);
		System.out.println("Tax: " +taxAmount);
		System.out.println("Shipping: " +shipCost);
		System.out.println("Total Due: " +finalAmount);
		if(giftCard == 1)
			System.out.println("Gift card applied to this order: " +giftCardAmount);
			else
			if(giftCard==0)
					System.out.println("Gift Card Applied: " +noGift);
		
		
		System.exit(0);
		
		

	}

	}

