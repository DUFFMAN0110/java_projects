package Game_Java;
import static java.util.Scanner.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent; 
import static java.lang.System.*; 
/*
 * imports go here
 * 
 * 
 * Move a 1 in an array of 0s through arrow key inputs 
 * ( for now  1, 2, 3, 4 as inputs for direction )
 * 
 */

import java.util.Scanner;

public class Player {
    private int size;
    private int move; 
    private int box = 0; 
    private int x = size / 2; 
    private int y = size / 2; 
    private int character = 1; 
    private int[][] gamePlace;
    private String str;
    private boolean toggle = true; 
    public Player(){}

    public void setSize(int s){

        size = s; 
        gamePlace = new int[size][size]; 
    }

    public void setMove(int m){
        Scanner kb = new Scanner(System.in); 
        move = m;
        int startX = x;
        int startY = y;
        try{
        if(move == 1){
            x--; 
            gamePlace[y][x] = character; 
            //left
        }
        else if(move == 2){
            y--; 
            gamePlace[y][x] = character; 
            //up
        }
        else if(move == 3){
            x++; 
            gamePlace[y][x] = character; 
            //right
        }
        else if(move == 4){
            y++; 
            gamePlace[y][x] = character; 
            //down
        }
        else if(move != 1 && move != 2 && move != 3 && move != 4){
            out.print("Try a different direction :: ");
            m = kb.nextInt(); 
            setMove(m);
        }
    }catch(ArrayIndexOutOfBoundsException e){
        out.print("HEY!\nYou can't go there.\nPick a different direction.\n"); 
        x = startX; 
        y = startY; 
        gamePlace[y][x] = character; 
    }

    
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
                }
                str += box + " ";
            }
            str += "\n"; 
        } 


    }
    public void keepMoving(){
        Scanner kb = new Scanner(System.in); 
        out.print("Do you want to keep moving? || yes(1)/no(0) ");
            int yn = kb.nextInt();  
            if(yn == 1){
                toggle = true;  
            }
            else if(yn == 0){
                toggle = false; 
            }
            while(yn != 0 && yn != 1){
                out.print("That isn't a choice dude. Try again :: "); 
                yn = kb.nextInt();
            }
    }
    public void goGame(){
        Scanner kb = new Scanner(System.in);
        while(toggle){
            
            out.print("Choose a direction || left(1) up(2) right(3) down(4) || :: "); 
            int m = kb.nextInt();
            Player.clearScreen(); 
            setMove(m); 
            out.print(toString());  
            keepMoving();
        }
    }

    public String toString(){
        gameBoard();
        return str; 
    }

    public static void clearScreen()
    {
        out.print("\033[H\033[2J");
        out.flush();
    }

    
}