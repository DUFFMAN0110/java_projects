//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class DiscountRunner
{ 
	public static void main( String args[] )
	{
		try (Scanner keyboard = new Scanner(System.in)) {
			out.print("Enter the original bill amount :: ");
			double amt = keyboard.nextDouble();
			Discount d = new Discount( amt );
			out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());

			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextDouble();
			d = new Discount( amt );
			out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());

			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextDouble();
			d = new Discount( amt );
			out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());
			
			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextDouble();
			d = new Discount( amt );
			out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());

			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextDouble();
			d = new Discount( amt );
			out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());
			// add more test cases
		}
	}
}

/*

Sample Data: 
500
2500
4000
333.33
95874.2154


Sample Output : 
Enter the original bill amount :: 500
Bill after discount :: 500.00

Enter the original bill amount :: 2500
Bill after discount :: 2125.00

Enter the original bill amount :: 4000
Bill after discount :: 3400.00

Enter the original bill amount :: 333.333
Bill after discount :: 333.33

Enter the original bill amount :: 95874.2154
Bill after discount :: 81493.08

*/