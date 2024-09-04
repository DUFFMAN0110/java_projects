package Spiral_Java;
import static java.lang.System.*; 
import java.util.Scanner;



public class SpiralRunner 
{
    public static void main ( String [] args )
    {
        
        try (Scanner kb = new Scanner(System.in)) {
            out.print("Enter a number:: ");
            int spiral = kb.nextInt();
            Spiral spin = new Spiral(spiral); 
            out.print("\n\n" + spin); 

        out.print("Enter a new number:: ");
        spiral = kb.nextInt();
        spin = new Spiral(spiral);
        out.print("\n\n" + spin);
        
        kb.close(); 
        } 
    }
}

