import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		
		double originalAmount;
		double amount; 
		
		/* Take in amount */
		System.out.print("Please Enter Your Amount: ");
		Scanner in = new Scanner(System.in);
		originalAmount = in.nextDouble();
		amount = originalAmount;
		
		
		/* Sanity check - the amount entered is the same as given */
		System.out.println("The Amount you have entered is $" + amount);
		
		
	/* TWENTY DOLLARS */
		
		int numberOfTwentyDollarBills = (int) (amount / 20);
		System.out.println(numberOfTwentyDollarBills + " Twenty Dollar Bill(s)");
		
		/* Remove the twenty dollar bills from total amount */
		amount = amount - (numberOfTwentyDollarBills * 20);
	
	/* TEN DOLLARS */
		
		int numberOfTenDollarBills = (int) (amount / 10);
		System.out.println(numberOfTenDollarBills + " Ten Dollar Bill(s)");

		/* Remove the ten dollar bills from total amount */
		amount = amount - (numberOfTenDollarBills * 10);

	/* FIVE DOLLARS */
	
		int numberOfFiveDollarBills = (int) (amount / 5);
		System.out.println(numberOfFiveDollarBills + " Five Dollar Bill(s)");

		/* Remove the five dollar bills from total amount */
		amount = amount - (numberOfFiveDollarBills * 5);

	/* TWO DOLLARS */
		
		int numberOfTwoDollarBills = (int) (amount / 2);
		System.out.println(numberOfTwoDollarBills + " Toonie(s)");

		/* Remove the one dollar bills from total amount */
		amount = amount - (numberOfTwoDollarBills * 2);
		
		
	/* ONE DOLLARS */
		
		int numberOfOneDollarBills = (int) (amount / 1);
		System.out.println(numberOfOneDollarBills + " Loonie(s)");

		/* Remove the one dollar bills from total amount */
		amount = amount - (numberOfOneDollarBills * 1);
		
	/*  DEALING DECIMALS */
		
		/* The idea is to multiply the existing amount by 100 and take out
		 * the decimal values (by two places) to become a whole number.
		 * 
		 * It is easier to deal with a whole number (above 1's decimal place
		 * than to deal with decimals themselves.
		 * 
		 * e.g. 0.56 
		 * 		0.56 * 100 = 56.0
		 * 
		 * Now we can operate on the 56.0 instead.
		 */
		
		amount = amount * 100;
		
	/* TWENTY FIVE CENTS */		
		
		int numberOfTwentyFiveCents= (int) (amount / 25);
		System.out.println(numberOfTwentyFiveCents + " Quarter(s)");

		/* Remove the twenty five cents from total amount */
		amount = amount - (numberOfTwentyFiveCents * 25);
		
	/* TEN CENTS */
		
		int numberOfTenCents= (int) (amount / 10);
		System.out.println(numberOfTenCents + " Dime(s)");

		/* Remove the ten cents from total amount */
		amount = amount - (numberOfTenCents * 10);
		
		return;
		
	}
	
	
}
