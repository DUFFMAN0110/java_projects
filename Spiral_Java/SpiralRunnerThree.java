package Spiral_Java;

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File; 
import java.io.IOException;

public class SpiralRunnerThree {
    public static void main ( String [] args ) throws IOException{
        try{Scanner sc = new Scanner(new File("Practice_Java\\data.dat")); 
            while(sc.hasNextInt()){
            Spiral spiral = new Spiral(sc.nextInt()); 
            out.println(spiral);
            }  
            sc.close(); 
        }
        catch(Exception e){
            out.print("well dis don't work"); 
        } 
       

    }
    
}

