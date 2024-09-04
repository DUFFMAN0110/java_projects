package Spiral_Java;
import static java.lang.System.*; 
import java.util.Scanner;



public class SpiralRunnerTwo 
{
    public static void main ( String [] args )
    {
        
        Spiral spin = new Spiral(5); 
        out.print("\n\n" + spin); 
        spin = new Spiral(6);
        out.println("\n\n" + spin);
    } 

}

