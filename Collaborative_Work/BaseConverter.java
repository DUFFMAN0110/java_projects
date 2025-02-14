package Collaborative_Work;
// import java.util.*; 


public class BaseConverter {
    private int base; 
    private int num; 
    private int convertedD; 
    private String convertedB; 
    // private ArrayList<Integer> listchars = new ArrayList<>(); 

    
    public BaseConverter(){
        base = 0; 
        num = 0; 
        convertedD = 0; 
        convertedB = ""; 
    }

    public void setBase(int n, int b){
        num = n;
        base = b; 
    }

    public int convertToDecimal(){
        int exp = 0; 
        int tempA = 0; 
        while(num > 0){
            tempA = num % 10; 
            convertedD += (int)(tempA*Math.pow(base,exp)); 
            num/=10; 
            exp++; 
        }
        return convertedD;  
    }
    
    public String convertToBase(){

        return convertedB; 

    }
    public String toString(){
        String output = "" + convertToDecimal() + ""; 
        return output; 
    }
    
}
