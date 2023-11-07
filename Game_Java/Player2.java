package Game_Java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import static java.lang.System.*; 
public class Player2 extends Thread implements KeyListener{


    private int box;
    private String str;
    private int size;
    private int[][] gamePlace;
    private int character = 1;
    private int y;
    private int x;
    //private int move;
    private boolean[] keys = new boolean[6];
    private boolean toggle; 


    public Player2(){}


    public void setSize(int s){

        size = s; 
        gamePlace = new int[size][size]; 
    }
    public void gameBoard(){
        box = 0;
        str = "";
        for(int j = 0; j < size; j++){
            for(int k = 0; k < size; k++){
                box = 0; 
                gamePlace[j][k] = box; 
                if(j == y && k == x ){
                    box = character;
                    gamePlace[j][k] = box;
                    //gamePlace[j][k] = box; 
                }
                str += box + " ";
            }
            str += "\n"; 
        } 
    }

    public void setMove(){
        
        int startX = x;
        int startY = y;
        try{
        if(keys[0]){
            //gamePlace[y][x] = 0;
            x--; 
            gamePlace[y][x] = character; 
            //left
        }
        else if(keys[1]){
            y--; 
            gamePlace[y][x] = character; 
            //up
        }
        else if(keys[2]){
            x++; 
            gamePlace[y][x] = character; 
            //right
        }
        else if(keys[3]){
            y++; 
            gamePlace[y][x] = character; 
            //down
        }
    }catch(ArrayIndexOutOfBoundsException e){
        out.print("HEY!\nYou can't go there.\nPick a different direction.\n"); 
        x = startX; 
        y = startY; 
        gamePlace[y][x] = character; 
    }
}
public void goGame(){
    Scanner kb = new Scanner(System.in);
    while(toggle){
        
        out.print("Choose a direction || left(1) up(2) right(3) down(4) || :: "); 
        //int m = kb.nextInt();
        //Player.clearScreen(); 
        setMove(); 
        out.print(toString());  
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
    public void run() {
        try
		{
            out.print(str); 
			while(true)
			{
				Thread.currentThread().sleep(5);
                
			} 
            
		}catch(Exception e)
		{
		}
    }

    
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A )
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_D )
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = true;
		}
		/*if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_R)
		{
			keys[4] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SHIFT || e.getKeyCode() == KeyEvent.VK_Q)
		{
			keys[5] = true;
		}*/

    }


    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_R)
		{
			keys[4] = false;
		}
		/*if (e.getKeyCode() == KeyEvent.VK_SHIFT || e.getKeyCode() == KeyEvent.VK_Q)
		{
			keys[5] = false;
		}*/
    }


    public String toString(){
        //setMove(move); 
        gameBoard();
        return str; 
    }


}
