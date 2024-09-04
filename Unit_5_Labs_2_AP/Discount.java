//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Discount
{
	private double amount;
	 
	public Discount( double a )
	{
		amount = a; 
	}

	public void setAmount( double a)
	{
		amount = a; 
	}
	
	// check sees if the amount if > 2000
	private boolean check()
	{
		if(amount > 2000) 
		{
			return true;
		}
		return false;
	}
	
	// getTheBill calls check and returns 
	// the original bill or 15% discounted bill
	public double getTheBill()
	{
		if(check()) 
		{
			return amount - (amount * (15/100.0)); 
		}
		return amount;
	}
}