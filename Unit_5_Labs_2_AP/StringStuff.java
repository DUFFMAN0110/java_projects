//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringStuff
{
	private String word; 
	// add in a String instance variable named word
	public StringStuff(String w)
	{
		word = w; 
	}
	// add in a constructor with one String parameter
	public void setString(String w)
	{
		word = w; 
	}
	// add in a setString method with one String parameter
 
 	public boolean isEvenLength()
 	{
		if(word.length() % 2 == 0)
		{
			return true; 
		}
		return false;
	}
	
	public boolean endsWith( String s )
	{
		if(word.substring((word.length() - s.length())).equals(s))
		{
			return true; 
		}
		return false;			
	}
	
 	public boolean sameFirstLastLetters()
 	{
		if(word.charAt(0) == word.charAt(word.length() - 1))
		{
			return true; 
		}
 	 	return false;
	}	

 	public String toString()
 	{
 		return word + "\n\n";
	}
}