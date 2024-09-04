

public class CaesarCipher implements CipherInterface{
    private String decoded;
    public CaesarCipher(){
        setWord(""); 
    }

    public CaesarCipher(String s){
        setWord(s);
    }

    public void setWord(String s){
        decoded = s; 
    }

    public String getWord(){
        return decoded;
    }
    //  DONE WITH A STRING ALPHABET
    // public String getCipher(){
    //     //going backwards 3 letter spaces a == 
    //     String alphabet = "abcdefghijklmnopqrstuvwxyz";
    //     String scrambled = ""; 
    //     String lower = decoded.toLowerCase(); 

    //     for(int i = 0; i < getWord().length(); i++){
            
    //         for(int j = 3; j < alphabet.length(); j++){
    //             if(lower.charAt(i) == alphabet.charAt(j)){
    //                 scrambled += alphabet.charAt(j - 3);

    //             }            
    //         } 
    //         if(lower.charAt(i) == 'a'){
    //             scrambled += 'x';
    //         }
    //         else if(lower.charAt(i) == 'b'){
    //             scrambled += 'y';
    //         }
    //         else if(lower.charAt(i) == 'c'){
    //             scrambled += 'z'; 
    //         }
    //     }
    //     return scrambled; 
    // }

    // DONE WITH THE ASCII VALUES 
    public String getCipher(){
        String scrambled = ""; 
          for(int i = 0; i < getWord().length(); i++){
            if(getWord().toUpperCase().charAt(i) < 65 && getWord().charAt(i) > 90 ){}
            if(getWord().toUpperCase().charAt(i) < 68 ){
                    scrambled += (char)(getWord().charAt(i) + 23);  
                }
            else{
               scrambled += (char)(getWord().charAt(i) - 3); 
            }
            
        }
        return scrambled; 
    }
            // DECODES BY ASCII
    public String getDecoded(){
        String decoded = "";
        for(int i = 0; i < getCipher().length(); i++){
            if(getCipher().toUpperCase().charAt(i) > 87 ){
                    decoded += (char)(getCipher().charAt(i) - 23);  
                }
            else{
               decoded += (char)(getCipher().charAt(i) + 3); 
           }
          }
        return decoded;  
    }
    public String toString(){
        return  getWord() + "\nEncoded :: " + getCipher() + "\nDecoded :: " + getDecoded()+ "\n\n"; 
    }

}
