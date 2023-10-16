package Game_Java;
/* 
 * imports go here
 * GOAL:: imports and utilizes other files
 *        Interactable graphics
 *        Have fun!!
 */
import static java.lang.System.*;
import java.util.Scanner;

public class GameRunner{

    public static void main(String[] args)
    {  
        boolean toggle = true;
        Scanner kb = new Scanner(System.in);
        Player you = new Player();  
        out.print("Size of Gameboard:: ");
        int s = kb.nextInt(); 
        you.setSize(s);        
        out.print(you); 

        while(toggle){
        out.print("Choose a direction || left(1) up(2) right(3) down(4) || :: "); 
        int m = kb.nextInt(); 
        you.setMove(m); 
        out.print(you); 
        out.print("Do you want to keep moving? || yes(1)/no(0) ");
        int yn = kb.nextInt();  
        if(yn == 1){
            toggle = true;  
        }
        else if(yn == 0){
            toggle = false; 
        }
        else if(yn != 0 && yn != 1){
            out.print("That isn't a choice dude. Try again :: "); 
            yn = kb.nextInt();
        }
    }
    }

}

