public class VigenereCipher implements CipherInterface{
    private String coded; 
    private String key; 
    public VigenereCipher(){
        setWord(""); 
        setKey(""); 
    }
    public VigenereCipher(String w, String k){
        setWord(w); 
        setKey(k); 
    }
    public void setWord(String w){
        coded = w; 
    }
    public void setKey(String k){
        key = k; 
    }
    public String getWord(){
        return coded;
    }
    public String getKey(){
        return key; 
    }

    public String getCipher(){
        String encoded = ""; 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int remain = 0; 
        int j = 0; 
        for(int i = 0; i < getWord().length(); i++){
            if(j >= getKey().length()){
                j=0;
            }

            if(getWord().charAt(i) == 32){continue;}
            if(getKey().charAt(j) == 32){continue;}


            remain = alphabet.indexOf(getKey().toLowerCase().charAt(j)) + alphabet.indexOf(getWord().toLowerCase().charAt(i));
            
            if(remain > 25){
             remain %= 25;
                if(getWord().charAt(i) >= 97){
                    char let = 'a' - 1;
                    remain = remain + let; 
                }else if(getWord().charAt(i) >= 65){
                    char let = 'A' - 1; 
                    remain = remain + let; 
                }
            }else{
                if(getWord().charAt(i) >= 97){
                    char let = 'a';
                    remain = (remain) + let; 
                }else if(getWord().charAt(i) >= 65){
                    char let = 'A'; 
                    remain = (remain) + let; 
                }
            }
             
           j++; 
           encoded += (char)remain; 
        }
        return encoded ; 
    }

    public String getDecoded(){
        String decoded = ""; 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int r = 0; 
        int j = 0; 
        for(int i = 0; i < getCipher().length(); i++){
            
            if(j >= getKey().length()){
                j=0;
            }
            
            r = alphabet.indexOf(getKey().toLowerCase().charAt(j));


            if(getCipher().charAt(i) == 32){System.out.println(" ");continue;}
            if(getKey().charAt(j) == 32){System.out.println(" ");continue;}


            if(getCipher().charAt(i) - r < 65 && getCipher().charAt(i) >= 65){
                r = Math.abs(alphabet.indexOf(getCipher().toLowerCase().charAt(i)) - alphabet.indexOf(getKey().toLowerCase().charAt(j)));
                r -= ('Z' + 1 ); 
            }else if(getCipher().charAt(i) - r < 97 && getCipher().charAt(i) >= 97){
                r = Math.abs(alphabet.indexOf(getCipher().toLowerCase().charAt(i)) - alphabet.indexOf(getKey().toLowerCase().charAt(j)));
                r -= ('z' + 1); 
            }else{
                if(getCipher().charAt(i) >= 97){
                    r -= getCipher().charAt(i);
                }else if(getCipher().charAt(i) >= 65){

                   r -= getCipher().charAt(i); 
                }
            }
             
           j++; 
           decoded += (char)Math.abs(r) ; 
        }


        return decoded; 
    }

    public String toString(){
        return getWord() + " " + getKey() + "\nEncoded :: " + getCipher() + "\nDecoded :: "+ getDecoded()+"\n\n"; 
    }
}
