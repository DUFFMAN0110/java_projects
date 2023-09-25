import static java.lang.System.*; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class SpiralRunnerThree
{
    public static void main ( String [] args ) throws IOException
    {
        
        Scanner file = new Scanner(new File("data.dat"));
        int spiral = file.nextInt();  
        Spiral spin = new Spiral(spiral);  
        out.println("\n\n" + spin);
    } 
    
}
