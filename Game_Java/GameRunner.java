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
 
    public static void main(String[] args){  

        Scanner kb = new Scanner(System.in);
        Player you = new Player();
        Player2 you2 = new Player2(); 
        
        out.print("Size of Gameboard:: ");
        int s = kb.nextInt(); 
        you.setSize(s);        
        out.print(you); 
        you.goGame(); 



    }

}

