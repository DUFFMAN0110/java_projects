package Mini_Games;

public class Boxes {
    //this is where we will write the methods to use for the boxes game created by agustin hinajosa aka AJ from work 
    public String makeBox(){
        String output = ""; 
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 6; j++){
                output += "| __ "; 
            }
            output += "|\n";
        }
        return output;
    }
}
