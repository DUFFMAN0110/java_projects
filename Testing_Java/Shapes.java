import java.util.*; 
import java.io.*; 

public class Shapes{


    public static void main(String[] args) throws IOException{
        try (Scanner file = new Scanner(new File("Testing_Java\\sketch.dat"))) {
            while(file.hasNextLine()){
                int shape = file.nextInt(); 
                int size = file.nextInt();
                int c = file.nextInt();
                boolean b = file.nextBoolean(); 
                String chara = "";
                String out = ""; 
                // determines the character to fill the shape with
                switch(c){
                    case 0: chara = "!"; 
                        break;
                    case 1: chara = "@";
                        break;
                    case 2: chara = "#"; 
                        break;
                    case 3: chara = "$"; 
                        break;
                    case 4: chara = "%"; 
                        break;
                    case 5: chara = "&"; 
                        break;
                    default: out = "Invalid input for character :: " + c + "\n";

                }

                switch(shape){
                    case 0: 
                        //square
                        if(b){
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    out += chara;
                                }
                                out += "\n"; 
                            }

                        }else{
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(i == 0 || i == size-1){
                                        out += chara;
                                    }else if(j == 0 || j == size - 1){
                                        out += chara; 
                                    }else{
                                        out += " ";
                                    }
                                }
                                out += "\n"; 
                            }
                        }

                        break;
                        //DL tri
                    case 1: 
                        if(b){
                            for(int i = 0; i < size; i++){
                                for(int j = i; j < size; j++){
                                    out += chara;
                                }
                                out += "\n"; 
                            }
                        }else{
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(i == 0){
                                        out += chara;
                                    }else if(j == size - 1 - i || j == 0){
                                        out += chara;
                                    }else{
                                        out += " ";
                                    }
                                }
                                out += "\n"; 
                            }
                        }
                    
                        break;
                    case 2:
                        //DR tri
                        if(b){
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(j < i){
                                        out += " "; 
                                    }else{
                                        out += chara; 
                                    }
                                }
                                out += "\n"; 
                            }
                        }else{
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(i==0){
                                        out += chara;
                                    }else if(j == size - 1 || j == i){
                                        out += chara;
                                    }else{
                                        out += " "; 
                                    }
                                }
                                out += "\n"; 
                            }
                        }
                        break;
                    case 3: 
                        //UL tri
                        if(b){
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if( j > i){
                                        out += " "; 
                                    }else{
                                        out += chara;
                                    }
                                }
                                out += "\n"; 
                            }
                        }else{
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(i == size - 1){
                                        out += chara;
                                    }else if(j == 0 || j == i){
                                        out += chara;
                                    }else{
                                        out += " "; 
                                    }
                                }
                                out += "\n"; 
                            }
                        }
                        break;
                    case 4: 
                        //UR tri
                        if(b){
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(i == size - 1 ){
                                        out += chara;
                                    }else if(j >= size -1 -i){
                                        out += chara;
                                    }else{
                                        out +=  " "; 
                                    }
                                }
                                out += "\n"; 
                            }
                        }else{
                            for(int i = 0; i < size; i++){
                                for(int j = 0; j < size; j++){
                                    if(i == size - 1 || j == size - 1){
                                        out += chara;
                                    }else if(j == size - 1 - i){
                                        out += chara;
                                    }else{
                                        out += " "; 
                                    }
                                }
                                out += "\n"; 
                            }                       
                        }
                        break;
                        default : out += "Invalid input for shape :: " + shape + "\nSorry, that doesn't print\n"; 
                }
                System.out.println(out);

            }
        }
    }
}