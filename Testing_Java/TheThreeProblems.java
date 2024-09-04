

import java.util.Arrays;

public class TheThreeProblems {
    public static void main(String[]args){
        //System.out.println(noVowels("asjdiofheusndfue")); // sjdfhsndf
        //System.out.println(countSub("timeceshiofjestimetimefsejeiotime","tim")); // 3
        //System.out.println(countSpaces("1 2 3 4 5     ")); //5
        int[] array1 = {1,4,6,7};
        int size1 = 4; 
        int[] array2 = {1,2,3,5,7};
        int size2 = 5; 
        changeDescArray(array1, size1, array2, size2);
        System.out.println(Arrays.toString(array1));
    }
    static String noVowels(String s){
        char[] store = s.toCharArray(); 

            for(int i = 0; i < store.length; i++){
                char x = store[i]; 
                switch(x){
                    case 'a':  s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'A':   s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'e':  s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'E':   s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'i':  s = s.substring(0, i) + s.substring(i+1); 
                        break;
                    case 'I':   s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'o':  s = s.substring(0, i) + s.substring(i+1); 
                        break;  
                    case 'O':   s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'u':   s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                    case 'U':   s = s.substring(0, i) + s.substring(i+1); 
                        break; 
                }
            }
        return s; 
    }
    static int countSub(String parent, String sub){
        int count = 0; 
        if(parent.length() >= sub.length()){
            if(parent.contains(sub)){
                for(int i = 0; i < parent.length() - sub.length() ; i++){
                    if(parent.substring(i, i + sub.length() ).equals(sub)){
                        count++; 
                    }
                }
            } 
        }else{
            count = 0; 
        }
        
        return count; 
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
        int[] newArray = new int[size1 + size2];
        for (  int i = 0; i < size1; i ++) {
            newArray[i] = array1[i];  
        }
        for(int i = size1, j = 0; i < size1 + size2; i++)
        {
            newArray[i] = array2[j]; 
        }
        
        array1 = new int[newArray.length]; 
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
    }
}
