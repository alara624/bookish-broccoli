package checkBalance;

public class checkBalance {

	public static void main(String[] args) {
		double beginbal,check1,check2,check3,deposit,finalbal;
		beginbal = 100;
		check1 = 20;
		check2 = 7;
		check3 = 45;
		deposit = 50;
		finalbal = beginbal + deposit - check1 - check2 - check3;
		
		System.out.println("Beginning balance = " +beginbal);
		System.out.println("Check 1 amount = " +check1);
		System.out.println("Check 2 amount = " +check2);
		System.out.println("Check 3 amount = " +check3);
		System.out.println("Deposit amount = " +deposit);
		System.out.println("Final balance = " +finalbal);
		
		System.exit(0);
		
		

	}

}
