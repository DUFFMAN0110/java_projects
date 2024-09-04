//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SocialRunner
{ 
	public static void main( String[] args )
	{
		Social s = new Social("463-44-5678");
		System.out.println(  s.check( )    );
		
		s = new Social("463-144-5678");
		System.out.println(  s.check( )    );

		s = new Social("111-44-5678");
		System.out.println(  s.check( )    );

		s = new Social("463044-5678");
		System.out.println(  s.check( )    );

		s = new Social("463-99-8888");
		System.out.println(  s.check( )    );

		s = new Social("123-11-5323");
		System.out.println(  s.check( )    );

		s = new Social("463-4-55678");
		System.out.println(  s.check( )    );

		s = new Social("4634415678");
		System.out.println(  s.check( )    );


		// add more test cases
	}
}

/*

Sample Data:
463-44-5678
46-144-5678
111-44-5678
463044-5678
463-99-8888
123-11-5323
463-4-55678
46314415678


Sample Output: 
5678
bad
5678
bad
8888
5323
bad
bad

*/