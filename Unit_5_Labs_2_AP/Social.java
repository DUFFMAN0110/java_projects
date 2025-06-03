package Unit_5_Labs_2_AP;


//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Social
{ 
	private String socialNum;
	
	public Social( String soc )
	{
		socialNum = soc; 
	}

	public void setSocial( String soc )
	{
		socialNum = soc; 
	}
	
	private boolean isValid()
	{
		if(socialNum.charAt(3) == '-' && socialNum.charAt(6) == '-')
		{
			return true; 
		}
		return false;
	}
	
	// method check must call isValid
	public String check()
	{
		String output = "bad"; 
		if(isValid())
		{
			output = socialNum.substring(socialNum.length() - 4); 
			return output;
		}
		return output; 
	}
}



