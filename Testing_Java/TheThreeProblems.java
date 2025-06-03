package Testing_Java;


import java.util.Arrays;

public class TheThreeProblems {
    public static void main(String[]args){
        // System.out.println(noVowels("asjdiofheusndfue")); // sjdfhsndf
        // System.out.println("This is the amount of times | tim | appears in this string:: " 
                // +  countSub("timeceshiofjestimetimefsejeiotime","tim")); // 4
        System.out.println(countSpaces("1 2 3 4 5     ")); //5
        int[] array1 = {1,4,6,7};
        int size1 = 4; 
        int[] array2 = {1,2,3,5,7};
        int size2 = 5; 
        changeDescArray(array1, size1, array2, size2);
        System.out.println(Arrays.toString(array1));
    }
    static String noVowels(String s){
        if(s.length() <= 0){
            return ""; 
        }
        char c = s.charAt(s.length()-1); 
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || 
            c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                return noVowels(s.substring(0,s.length()-1)); 
        }
        return noVowels(s.substring(0,s.length()-1)) + s.charAt(s.length()-1); 
    }
    static int countSub(String parent, String sub){
        if(parent.length() == 0 || sub.length() == 0){
            return 0; 
        }

        if(parent.length() >= sub.length()){
            int size = parent.length() - sub.length();
            if(parent.substring(size).equals(sub)){
                return 1 + countSub(parent.substring(0, size), sub); 
            }
        }
            return 0 + countSub(parent.substring(0,parent.length()-1), sub); 

    }
    static int countSpaces(String s){
        int count = 0; 
        if(s.contains(" ")){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 32){
                    count++; 
                }
            }
        }else{
            count = 0; 
        }
        
        return count;
    }
    static void changeDescArray(int[] array1, int size1, int[] array2, int size2){
        System.out.println("This is array1's old size:: " + array1.length);
        int[] newArray = new int[size1 + size2];
        int[] tempArr1 = array1; 
        array1 = new int[newArray.length];
        System.out.println("This is array1's new size:: " + array1.length);
        for (  int i = 0; i < size1; i ++) {
            newArray[i] = tempArr1[i];  
        }
        for(int i = size1, j = 0; i < size1 + size2; i++,j++)
        {
            newArray[i] = array2[j]; 
        }
         
        for(int i = 0; i < newArray.length; i++){
            int min = i; 
            for(int j = i + 1; j < newArray.length; j++ ){
                
                if(newArray[j] < newArray[min]){
                    min = j; 
                }
            }
            if(min != i){
                int temp = newArray[i];
                newArray[i] = newArray[min]; 
                newArray[min] = temp;
            }
        }
        
        array1 = newArray; 
        System.out.println("This is array1:: " + Arrays.toString(array1));
    }
}
