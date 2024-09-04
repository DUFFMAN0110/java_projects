
import java.util.*; 

public class Testing{
    public static void main(String[] args){
        PriorityQueue<Integer> w = new PriorityQueue<Integer>(); 
        w.add(3); 
        w.add(2);
        w.add(0);
        w.add(5);
        w.add(9);
        w.add(-3);
        System.out.println(w + "\n" );
        System.out.println( w.remove() ); 

        System.out.println(w ); 
        w.remove(); 
        System.out.println(w + "\n");
        System.out.println(w.peek() + "\n");
        System.out.println(w);



        System.out.println("\n\n");
        System.out.println(Math.ceil(4));

    }
    static int add(int l){
        int k = l; 
        return k;
    }
}