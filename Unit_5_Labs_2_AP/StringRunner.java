//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{ 
		try (Scanner keyboard = new Scanner(System.in)) {
			out.print("Enter a word :: ");
			String word = keyboard.next();
			StringStuff s = new StringStuff( word );
			System.out.println( "has even length:: " + s.isEvenLength() );
			System.out.println( "has same first last letters:: " + s.sameFirstLastLetters() );
			System.out.println( "ends with cat:: " + s.endsWith( "cat" ) );
			System.out.println( s );
			
			out.print("Enter a word :: ");
			word = keyboard.next();
			s = new StringStuff( word );
			System.out.println( "has even length:: " + s.isEvenLength() );
			System.out.println( "has same first last letters:: " + s.sameFirstLastLetters() );
			System.out.println( "ends with it:: " + s.endsWith( "it" ) );
			System.out.println( s );
		}
	
	}
}

/* Sample Output : 
Enter a word :: chickencat
has even length true
has same first last letters false
ends with cat true
chickencat


Enter a word :: itwasafuntripitwas
has even length true
has same first last letters false
ends with it false
itwasafuntripitwas

*/