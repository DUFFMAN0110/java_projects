package Game_Java;
import static java.util.Scanner.*; 
import static java.lang.System.*; 
/*
 * imports go here
 * 
 * 
 * Move a 1 in an array of 0s through arrow key inputs 
 * ( for now through 1, 2, 3, 4 as inputs for direction )
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
        if(move == 1){
            //gamePlace[y][x] = 0;
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
    public String toString(){
        //setMove(move); 
        gameBoard();
        return str; 
    }

}