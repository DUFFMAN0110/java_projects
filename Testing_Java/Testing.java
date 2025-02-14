package Testing_Java;

import java.util.*; 

import java.io.FileReader; 
import java.io.FileWriter;
import java.io.IOException;
// import java.nio.file.Path;
// import java.nio.file.Paths; 

public class Testing{
    public static void main(String[] args) throws IOException{
        // PriorityQueue<Integer> w = new PriorityQueue<Integer>(); 
        // w.add(3); 
        // w.add(2);
        // w.add(0);
        // w.add(5);
        // w.add(9);
        // w.add(-3);
        // System.out.println(w + "\n" );
        // System.out.println( w.remove() ); 

        // System.out.println(w ); 
        // w.remove(); 
        // System.out.println(w + "\n");
        // System.out.println(w.peek() + "\n");
        // System.out.println(w);


        String path = "java_projects\\Testing_Java\\test.txt";
        FileWriter fileWriter = new FileWriter(path); 
        // FileReader fileReader = new FileReader(path);
        
       
        fileWriter.write("Please work"); 
        // Path pathth = Paths.get(path);
        System.out.println("File has been written on"); 
        // Scanner file = new Scanner(pathth); 
        // while(file.hasNextLine()){
        //     System.out.println(file.nextLine());
        // }
        // System.out.println("\n\n");
        // System.out.println(Math.ceil(4));

    }
    // static int add(int l){
    //     int k = l; 
    //     return k;
    // }
}